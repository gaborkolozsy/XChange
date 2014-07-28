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
package com.xeiam.xchange.btccentral;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xeiam.xchange.btccentral.dto.marketdata.BTCCentralMarketDepth;
import com.xeiam.xchange.btccentral.dto.marketdata.BTCCentralTicker;
import com.xeiam.xchange.btccentral.dto.marketdata.BTCCentralTrade;

/**
 * @author ObsessiveOrange
 */
public class MarketDataTest {

  @Test
  public void testBTCCentralTickerRequest() throws JsonParseException, JsonMappingException, IOException {

    // Read in the JSON from the example resources
    InputStream is = MarketDataTest.class.getResourceAsStream("/Example_TickerData.json");

    // Use Jackson to parse it
    ObjectMapper mapper = new ObjectMapper();
    BTCCentralTicker btcCentralTicker = mapper.readValue(is, BTCCentralTicker.class);

    assertEquals(btcCentralTicker.getCurrency(), "EUR");
    assertEquals(btcCentralTicker.getAsk(), new BigDecimal("20.4"));
    assertEquals(btcCentralTicker.getBid(), new BigDecimal("20.1"));
    assertEquals(btcCentralTicker.getHigh(), new BigDecimal("20.74"));
    assertEquals(btcCentralTicker.getLow(), new BigDecimal("20.2"));
    assertEquals(btcCentralTicker.getPrice(), new BigDecimal("20.2"));
    assertEquals(btcCentralTicker.getVolume(), new BigDecimal("148.80193218"));

  }

  @Test
  public void testBTCCentralDepthRequest() throws JsonParseException, JsonMappingException, IOException {

    // Read in the JSON from the example resources
    InputStream is = MarketDataTest.class.getResourceAsStream("/Example_DepthData.json");

    // Use Jackson to parse it
    ObjectMapper mapper = new ObjectMapper();
    BTCCentralMarketDepth btcCentralMarketDepth = mapper.readValue(is, BTCCentralMarketDepth.class);

    assertEquals(btcCentralMarketDepth.getAsks().get(0).getAmount(), new BigDecimal("0.48762"));
    assertEquals(btcCentralMarketDepth.getAsks().get(0).getPrice(), new BigDecimal("24.48996"));
    assertEquals(btcCentralMarketDepth.getBids().get(0).getAmount(), new BigDecimal("0.77372456"));
    assertEquals(btcCentralMarketDepth.getBids().get(0).getPrice(), new BigDecimal("24.05"));

  }

  @Test
  public void testBTCCentralTradesRequest() throws JsonParseException, JsonMappingException, IOException {

    // Read in the JSON from the example resources
    InputStream is = MarketDataTest.class.getResourceAsStream("/Example_TradesData.json");

    // Use Jackson to parse it
    ObjectMapper mapper = new ObjectMapper();
    BTCCentralTrade[] btcCentralTrades = mapper.readValue(is, BTCCentralTrade[].class);

    assertEquals(btcCentralTrades[0].getPrice(), new BigDecimal("5.0"));
    assertEquals(btcCentralTrades[0].getTraded_btc(), new BigDecimal("980.0"));
    assertEquals(btcCentralTrades[0].getTraded_currency(), new BigDecimal("4940.0"));

  }

}
