/*

    The MIT License (MIT)

    Copyright (c) 2016 Saurabh Sejpal

    Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
    documentation files (the "Software"), to deal in the Software without restriction, including without limitation
    the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
    and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all copies or substantial
    portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
    TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
    THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
    CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
    IN THE SOFTWARE.

*/

package com.postmark.java.util;

/**
 *
 * This Class will have all the Constants listed here, which includes Postmark Urls Also.
 *
 *
 * @author Saurabh Sejpal
 */
public class ProjectConstants {

    public static final int MAXIMUM_SERVER_COUNT   =   100;

    public static final int OFFSET_COUNT   =   0;

    public static final String SEPARATOR =   "/";

    public static final boolean isServerToken = PropertyLoader.isServerTokenThere();

    public static final boolean isAccountToken  =   PropertyLoader.isAccountTokenThere();
    
    public static final String POSTMARK_ENDPOINT    =   "https://api.postmarkapp.com/";

    public static final String EMAIL    =   "email";

    public static final String TRIGGERS =   "triggers";

    public static final String  INBOUND_RULES   =   "inboundrules";

    public static final String  TAGS    =   "tags";

    public static final String  SIGNATURES    =   "senders";

    public static final String SERVERS      =   "servers";

    public static final String COUNT    =   "count";

    public static final String OFFSET   =   "offset";

    public static final String POSTMARK_SERVER_STRING   =   "X-Postmark-Server-Token";

    public static final String POSTMARK_ACCOUNT_STRING   =   "X-Postmark-Account-Token";

}
