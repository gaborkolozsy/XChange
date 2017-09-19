package org.knowm.xchange.bitstamp.dto;

import org.knowm.xchange.utils.error.ExchangeError;

/**
 * Bitstamp errors with helpful note from
 * <a href="https://www.bitstamp.net/api/#authentication-errors">Bitstamp API</a> for fix them.
 *
 * @author Kolozsy Gábor <a href="https://github.com/gaborkolozsy/>
 */
public enum BitstampError implements ExchangeError {

    /**
     * COMMON ERRORS FOR THE FOLLOWING TYPES OF ERRORS:
     *
     * AUTHENTICATION,
     * BALANCE,
     * OPEN ORDERS,
     * ORDER STATUS,
     * CANCEL ORDER,
     * CANCEL ALL ORDERS,
     * BUY,
     * MARKET BUY,
     * SELL,
     * MARKET SELL,
     * WITHDRAWAL REQUEST,
     * LTC DEPOSIT ADDRESS,
     * ETH DEPOSIT ADDRESS,
     * BTC DEPOSIT ADDRESS,
     * UNCONFIRMED BITCOIN DEPOSITS,
     * RIPPLE WITHDRAWAL,
     * RIPPLE DEPOSIT ADDRESS,
     * TRANSFER BALANCE FROM SUB TO MAIN ACCOUNT,
     * TRANSFER BALANCE FROM MAIN TO SUB ACCOUNT,
     * XRP WITHDRAWAL,
     * XRP DEPOSIT ADDRESS,
     * OPEN BANK WITHDRAWAL,
     * BANK WITHDRAWAL STATUS,
     * CANCEL BANK WITHDRAWAL,
     * NEW LIQUIDATION ADDRESS,
     * LIQUIDATION ADDRESS INFO ERRORS
     */
    BITSTAMP_ERROR_0000(Error.E_0000, Note.N_0000),
    BITSTAMP_ERROR_0001(Error.E_0001, Note.N_0001),
    BITSTAMP_ERROR_0002(Error.E_0002, Note.N_0002),
    BITSTAMP_ERROR_0003(Error.E_0003, Note.N_0003),
    BITSTAMP_ERROR_0004(Error.E_0004, Note.N_0004),
    BITSTAMP_ERROR_0005(Error.E_0005, Note.N_0005),
    BITSTAMP_ERROR_0006(Error.E_0006, Note.N_0006),
    BITSTAMP_ERROR_0007(Error.E_0007, Note.N_0007),
    BITSTAMP_ERROR_0008(Error.E_0008, Note.N_0008),

    /**
     * TRANSACTION ERRORS
     */
    BITSTAMP_ERROR_0009(Error.E_0009, Note.N_0009),
    BITSTAMP_ERROR_0010(Error.E_0010, Note.N_0010),
    BITSTAMP_ERROR_0011(Error.E_0011, Note.N_0011),
    BITSTAMP_ERROR_0012(Error.E_0012, Note.N_0012),
    /**
     * ORDER STATUS, CANCEL ORDER ERRORS
     */
    BITSTAMP_ERROR_0013(Error.E_0013, Note.N_0013),
    BITSTAMP_ERROR_0014(Error.E_0014, Note.N_0014),
    BITSTAMP_ERROR_0015(Error.E_0015, Note.N_0015),

    /**
     * CANCEL ORDER ERROR
     */
    BITSTAMP_ERROR_0016(Error.E_0016, Note.N_0016),

    /**
     * BUY ERRORS
     */
    BITSTAMP_ERROR_0017(Error.E_0017, Note.N_0017),
    BITSTAMP_ERROR_0018(Error.E_0018, Note.N_0018),
    BITSTAMP_ERROR_0019(Error.E_0019, Note.N_0019),
    BITSTAMP_ERROR_0020(Error.E_0020, Note.N_0020),
    BITSTAMP_ERROR_0021(Error.E_0021, Note.N_0021),
    BITSTAMP_ERROR_0022(Error.E_0022, Note.N_0022),
    BITSTAMP_ERROR_0023(Error.E_0023, Note.N_0023),
    BITSTAMP_ERROR_0024(Error.E_0024, Note.N_0024),

    /**
     * SELL ERRORS
     */
    BITSTAMP_ERROR_0025(Error.E_0025, Note.N_0025),
    BITSTAMP_ERROR_0026(Error.E_0026, Note.N_0026),
    BITSTAMP_ERROR_0027(Error.E_0027, Note.N_0027),
    BITSTAMP_ERROR_0028(Error.E_0028, Note.N_0028),
    BITSTAMP_ERROR_0029(Error.E_0029, Note.N_0029),

    /**
     * WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0030(Error.E_0030, Note.N_0030),
    BITSTAMP_ERROR_0031(Error.E_0031, Note.N_0031),
    BITSTAMP_ERROR_0032(Error.E_0032, Note.N_0032),
    BITSTAMP_ERROR_0034(Error.E_0034, Note.N_0034),

    /**
     * BITCOIN WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0035(Error.E_0035, Note.N_0035),
    BITSTAMP_ERROR_0036(Error.E_0036, Note.N_0036),
    BITSTAMP_ERROR_0037(Error.E_0037, Note.N_0037),
    BITSTAMP_ERROR_0038(Error.E_0038, Note.N_0038),

    /**
     * LITECOIN WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0039(Error.E_0039, Note.N_0039),
    BITSTAMP_ERROR_0040(Error.E_0040, Note.N_0040),
    BITSTAMP_ERROR_0041(Error.E_0041, Note.N_0041),

    /**
     * ETH WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0042(Error.E_0042, Note.N_0042),
    BITSTAMP_ERROR_0043(Error.E_0043, Note.N_0043),
    BITSTAMP_ERROR_0044(Error.E_0044, Note.N_0044),
    BITSTAMP_ERROR_0045(Error.E_0045, Note.N_0045),

    /**
     * ETH DEPOSIT ADDRESS ERROR
     */
    BITSTAMP_ERROR_0046(Error.E_0046, Note.N_0046),

    /**
     * RIPPLE WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0047(Error.E_0047, Note.N_0047),
    BITSTAMP_ERROR_0048(Error.E_0048, Note.N_0048),
    BITSTAMP_ERROR_0049(Error.E_0049, Note.N_0049),
    BITSTAMP_ERROR_0050(Error.E_0050, Note.N_0050),

    /**
     * TRANSFER BALANCE FROM SUB TO MAIN ACCOUNT,
     * TRANSFER BALANCE FROM MAIN TO SUB ACCOUNT ERRORS
     */
    BITSTAMP_ERROR_0051(Error.E_0051, Note.N_0051),
    BITSTAMP_ERROR_0052(Error.E_0052, Note.N_0052),

    /**
     * XRP WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0053(Error.E_0053, Note.N_0053),
    BITSTAMP_ERROR_0054(Error.E_0054, Note.N_0054),
    BITSTAMP_ERROR_0055(Error.E_0055, Note.N_0055),
    BITSTAMP_ERROR_0056(Error.E_0056, Note.N_0056),

    /**
     * OPEN BANK WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0057(Error.E_0057, Note.N_0057),
    BITSTAMP_ERROR_0058(Error.E_0058, Note.N_0058),
    BITSTAMP_ERROR_0059(Error.E_0059, Note.N_0059),
    BITSTAMP_ERROR_0060(Error.E_0060, Note.N_0060),
    BITSTAMP_ERROR_0061(Error.E_0061, Note.N_0061),
    BITSTAMP_ERROR_0062(Error.E_0062, Note.N_0062),
    BITSTAMP_ERROR_0063(Error.E_0063, Note.N_0063),

    /**
     * BANK WITHDRAWAL STATUS ERRORS
     */
    BITSTAMP_ERROR_0065(Error.E_0065, Note.N_0065),
    BITSTAMP_ERROR_0066(Error.E_0066, Note.N_0066),
    BITSTAMP_ERROR_0067(Error.E_0067, Note.N_0067),
    BITSTAMP_ERROR_0068(Error.E_0068, Note.N_0068),

    /**
     * CANCEL BANK WITHDRAWAL ERRORS
     */
    BITSTAMP_ERROR_0069(Error.E_0069, Note.N_0069),
    BITSTAMP_ERROR_0070(Error.E_0070, Note.N_0070),
    BITSTAMP_ERROR_0071(Error.E_0071, Note.N_0071),
    BITSTAMP_ERROR_0072(Error.E_0072, Note.N_0072),

    /**
     * NEW LIQUIDATION ADDRESS ERRORS
     */
    BITSTAMP_ERROR_0073(Error.E_0073, Note.N_0073),
    BITSTAMP_ERROR_0074(Error.E_0074, Note.N_0074),
    BITSTAMP_ERROR_0075(Error.E_0075, Note.N_0075);

    private String error;
    private String note;

    BitstampError(String error, String note) {
        this.error = error;
        this.note = note;
    }

    @Override
    public String getError() {
        return error;
    }

    @Override
    public String getNote() {
        return note;
    }

    interface Error {

        String E_0000 = "";
        String E_0001 = "API key not found";
        String E_0002 = "IP address not allowed";
        String E_0003 = "No permission found";
        String E_0004 = "Invalid nonce";
        String E_0005 = "Invalid signature";
        String E_0006 = "Authentication failed";
        String E_0007 = "Missing key, signature and nonce parameters";
        String E_0008 = "Your account is frozen";
        String E_0009 = "Invalid offset";
        String E_0010 = "Limit too large";
        String E_0011 = "Invalid limit";
        String E_0012 = "Invalid sort parameter";
        String E_0013 = "Missing id POST param";
        String E_0014 = "Invalid order id";
        String E_0015 = "Order not found";
        String E_0016 = "Order in queue. Please try again later.";
        String E_0017 = "Minimum order size is 5 XXX";
        String E_0018 = "Missing amount and/or price POST parameters";
        String E_0019 = "X: Enter a number. Use \".\" as a decimal point.";
        String E_0020 = "Price is more than 20% above market price.";
        String E_0021 = "You need 0.00 XXX to open that order. You have only 0.00 XXX available. Check your account balance for details.";
        String E_0022 = "Sell if executed price must be higher than buy price.";
        String E_0023 = "Both limit_price and daily_order cannot be set.";
        String E_0024 = "You can only buy 'amount' 'currency'. Check your account balance for details.";
        String E_0025 = "Minimum order size is $5";
        String E_0026 = "Price is more than 20% below market price.";
        String E_0027 = "You have only 'available_btc' BTC available. Check your account balance for details.";
        String E_0028 = "Buy if executed price must be lower than sell price.";
        String E_0029 = "You can only sell 'amount' 'currency'. Check your account balance for details.";
        String E_0030 = "Missing amount and/or address POST parameters";
        String E_0031 = "Ensure this value is greater than or equal to 0.00006000";
        String E_0032 = "Ensure this value has at least 25 characters (it has x)\nEnsure this value has at most 34 characters (it has x)";
        String E_0034 = "User not verified";
        String E_0035 = "Instant parameter needs to be an integer (0 - false or 1 - true)";
        String E_0036 = "Bitcoin withdrawals are currently unavailable for your account.";
        String E_0037 = "Not allowed to withdraw to specified bitcoin address";
        String E_0038 = "You have only 'available' BTC available. Check your account balance for details.";
        String E_0039 = "Litecoin withdrawals are currently unavailable for your account.";
        String E_0040 = "Not allowed to withdraw to specified litecoin address";
        String E_0041 = "You have only 'available' LTC available. Check your account balance for details.";
        String E_0042 = "ETH withdrawals are currently unavailable for your account.";
        String E_0043 = "Not allowed to withdraw to specified ETH address";
        String E_0044 = "Ensure this value has at least 40 characters (it has x) Ensure this value has at most 42 characters (it has x)";
        String E_0045 = "You have only 'available' ETH available. Check your account balance for details.";
        String E_0046 = "Address not ready due to network congestion. Please try again in few minutes.";
        String E_0047 = "Missing amount and/or address and/or currency POST parameters";
        String E_0048 = "Ripple withdrawals are currently unavailable for your account.";
        String E_0049 = "Ensure this value has at least 25 characters (it has x) Ensure this value has at most 50 characters (it has x)";
        String E_0050 = "You have only 'available' 'currency' available. Check your account balance for details.";
        String E_0051 = "Select a valid choice. X is not one of the available choices.";
        String E_0052 = "Sub account with identifier \"X\" does not exist.";
        String E_0053 = "XRP withdrawals are currently unavailable for your account.";
        String E_0054 = "Not allowed to withdraw to specified XRP address";
        String E_0055 = "Ensure this value is greater than or equal to 20";
        String E_0056 = "You have only 'available' XRP available. Check your account balance for details.";
        String E_0057 = "Please update your profile with your FATCA information, before withdrawing.";
        String E_0058 = "Opening bank withdrawals with sub account API keys is not supported.";
        String E_0059 = "'X': ['This field is required.']";
        String E_0060 = "'X': ['Select a valid choice. X is not one of the available choices.']";
        String E_0061 = "Bank withdrawals temporarily disabled.";
        String E_0062 = "Unsupported withdrawal type (must be either SEPA or international).";
        String E_0063 = "You have only 'amount' currency available. Check your account balance for details.";
        String E_0065 = "Please update your profile with your FATCA information, before performing withdrawal status checks.";
        String E_0066 = "Performing bank withdrawal status checks with sub account API keys is not supported.";
        String E_0067 = "Missing parameters: [...].";
        String E_0068 = "No bank withdrawal with id=X found.";
        String E_0069 = "Please update your profile with your FATCA information, before cancelling withdrawals.";
        String E_0070 = "Cancelling bank withdrawals with sub account API keys is not supported.";
        String E_0071 = "No active bank withdrawal with id=X found.";
        String E_0072 = "Cannot cancel a withdrawal in process (id=X).";
        String E_0073 = "Missing liquidation_currency parameter.";
        String E_0074 = "Invalid currency. or Currency [...] not supported.";
        String E_0075 = "Cannot create new address, please try later.";

    }

    interface Note {

        String N_0000 = "Should be activate your API key. Don't forget verify after it.";
        String N_0001 = "Check your API key value.";
        String N_0002 = "This IP address has no permission to use this API key.";
        String N_0003 = "API key hasn't got permission for calling this function.";
        String N_0004 = "Check your nonce value. It must be greater than last nonce used.";
        String N_0005 = "Posted signature doesn't match with ours.";
        String N_0006 = "Can't find customer with selected API key.";
        String N_0007 = "Parameters were not posted in API request.";
        String N_0008 = "Contact support to unfreeze your account.";
        String N_0009 = "Offset should be positive number.";
        String N_0010 = "Max value of limit parameter is 1000.";
        String N_0011 = "Limit parameter should be number from 1 to 1000.";
        String N_0012 = "Max value of limit parameter is 1000.";
        String N_0013 = "Id parameter missing.";
        String N_0014 = "Order id parameter can only be number.";
        String N_0015 = "Order with that id was not found in our system.";
        String N_0016 = "Limit parameter should be number from 1 to 1000.";
        String N_0017 = "Order value must be at least $5.";
        String N_0018 = "Missing one or both parameters.";
        String N_0019 = "X can only be number.";
        String N_0020 = "Id parameter missing.";
        String N_0021 = "Account has less 0.00 that are required to make this order.";
        String N_0022 = "'limit_price' must be larger than 'price' parameter.";
        String N_0023 = "Only one of those parameters can be set.";
        String N_0024 = "Account has less 'available_currency' that are required to make this order.";
        String N_0025 = "Order value must be at least $5.";
        String N_0026 = "Order price must not exceed 20% of current price.";
        String N_0027 = "Account has less 'available_btc' that are required to make this order.";
        String N_0028 = "'limit_price' must be lower than 'price' parameter.";
        String N_0029 = "Account has less 'available_currency' that are required to make this order.";
        String N_0030 = "One or both parameters missing.";
        String N_0031 = "Minimum withdrawal amount is 0.00006";
        String N_0032 = "Address parameter must be between 25 and 34 characters long.";
        String N_0034 = "You need to verify account before withdrawal.";
        String N_0035 = "Instant parameter can only be 0 or 1";
        String N_0036 = "Contact support for additional information.";
        String N_0037 = "API key is set for withdrawing to another bitcoin address.";
        String N_0038 = "Account has less 'available' BTC that are required to make this withdrawal.";
        String N_0039 = "Contact support for additional information.";
        String N_0040 = "API key is set for withdrawing to another litecoin address.";
        String N_0041 = "Account has less 'available' LTC that are required to make this withdrawal.";
        String N_0042 = "Contact support for additional information.";
        String N_0043 = "API key is set for withdrawing to another ETH address.";
        String N_0044 = "Address parameter must be between 40 and 42 characters long.";
        String N_0045 = "Account has less 'available' ETH that are required to make this withdrawal.";
        String N_0046 = "We couldn't provide you with an address due to network congestion.";
        String N_0047 = "One or all parameters are missing.";
        String N_0048 = "Contact support for additional information.";
        String N_0049 = "Address parameter must be between 25 and 50 characters long.";
        String N_0050 = "Account has less 'available' 'currency' that are required to make this withdrawal.";
        String N_0051 = "X is not valid currency. Possible choices BTC, USD, EUR, XRP.";
        String N_0052 = "Can't find sub account with id X.";
        String N_0053 = "Contact support for additional information.";
        String N_0054 = "API key is set for withdrawing to another XRP address.";
        String N_0055 = "Minimum withdrawal amount is 20";
        String N_0056 = "Account has less 'available' XRP that are required to make this withdrawal.";
        String N_0057 = "You must have the FATCA information updated on your profile, before using this service.";
        String N_0058 = "This API endpoint can only be utilized by your main account.";
        String N_0059 = "Parameter X is required for this call.";
        String N_0060 = "Y is not a valid value for parameter X.";
        String N_0061 = "No new bank withdrawals can be opened at this time.";
        String N_0062 = "When opening bank withdrawals, you must specify one of the two supported types: SEPA or international.";
        String N_0063 = "To open this withdrawal, your balance must have at least 'amount' of target currency available.";
        String N_0065 = "You must have the FATCA information updated on your profile, before using this service.";
        String N_0066 = "This API endpoint can only be utilized by your main account.";
        String N_0067 = "Parameters stated in the list ([...]) are required for this call.";
        String N_0068 = "Could not find any bank withdrawal with the id X.";
        String N_0069 = "You must have the FATCA information updated on your profile, before using this service.";
        String N_0070 = "This API endpoint can only be utilized by your main account.";
        String N_0071 = "Could not find any active bank withdrawal with the id X. Will return the same response for already cancelled withdrawal requests.";
        String N_0072 = "The bank withdrawal request with id=X is currently being processed and cannot be cancelled.";
        String N_0073 = "Parameter liquidation_currency is required for this call.";
        String N_0074 = "Invalid liquidation_currency.";
        String N_0075 = "At the moment we can't create new deposit address. Try again later.";

    }

}
