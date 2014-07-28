/**
 * The MIT License
 * Copyright (c) 2012 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.xeiam.xchange.atlasats.services;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xeiam.xchange.atlasats.AtlasExchangeSpecification;
import si.mazi.rescu.RestProxyFactory;

public class RescuAccountServiceTest {

	@Path("/api/v1")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public interface AccountSevice {

		@GET
		@Path("account")
		public String getAccountInfo(@HeaderParam("Authorization") String apiKey);

		@GET
		@Path("market/symbols")
		public List<Map<String, Object>> getExchangeSymbols(
				@HeaderParam("Authorization") String apiKey);

		@GET
		@Path("market/symbols")
		public String getOptionContracts(
				@HeaderParam("Authorization") String apiKey);
	}

	private static final Logger LOGGER = LoggerFactory
			.getLogger(RescuAccountServiceTest.class);
	private AccountSevice accountSevice;

	@Before
	public void setUp() throws Exception {
		accountSevice = RestProxyFactory.createProxy(AccountSevice.class,
				AtlasExchangeSpecification.TEST_SSL_URL);
	}

	@After
	public void tearDown() throws Exception {
		accountSevice = null;
	}

	@Test
	public void testAccountInfo() {
		try {
			String response = accountSevice.getAccountInfo("Token token=\""
					+ AtlasExchangeSpecification.TEST_API_KEY + "\"");
			LOGGER.info(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Test
	public void testExchangeSymbols() {
		try {
			List<Map<String, Object>> response = accountSevice
					.getExchangeSymbols("Token token=\""
							+ AtlasExchangeSpecification.TEST_API_KEY + "\"");
			for (Map<String, Object> map : response) {
				LOGGER.info(map.toString());
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Test
	public void testOptionContracts() {
		try {
			String response = accountSevice.getOptionContracts("Token token=\""
					+ AtlasExchangeSpecification.TEST_API_KEY + "\"");
			LOGGER.info(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

}
