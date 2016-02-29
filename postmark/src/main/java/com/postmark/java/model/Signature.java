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

package com.postmark.java.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author Saurabh Sejpal
 * @version 1.0
 * @since 1.0
 */
public class Signature {

    @SerializedName("ID")
    private long signatureId;

    @SerializedName("Domain")
    private String domain;

    @SerializedName("EmailAddress")
    private String email;

    @SerializedName("ReplyToEmailAddress")
    private String replyToEmail;

    @SerializedName("Name")
    private String name;

    @SerializedName("Confirmed")
    private boolean isSignatureConfirmed;

    @SerializedName("SPFVerified")
    private boolean isSPFVerified;

    @SerializedName("SPFHost")
    private String SPFHost;

    @SerializedName("SPFTextValue")
    private String SPFTextValue;

    @SerializedName("DKIMVerified")
    private boolean isDKIMVerified;

    @SerializedName("WeakDKIM")
    private boolean isWeakDKIM;

    @SerializedName("DKIMHost")
    private String DKIMHost;

    @SerializedName("DKIMTextValue")
    private String DKIMTextValue;

    @SerializedName("DKIMPendingHost")
    private String DKIMPendingHost;

    @SerializedName("DKIMPendingTextValue")
    private String DKIMPendingTextValue;

    @SerializedName("DKIMRevokedHost")
    private String DKIMRevokedHost;

    @SerializedName("DKIMRevokedTextValue")
    private String DKIMRevokedTextValue;

    @SerializedName("SafeToRemoveRevokedKeyFromDNS")
    private boolean isSafeToRemoveRevokedKeyFromDNS;

    @SerializedName("DKIMUpdateStatus")
    private String DKIMUpdateStatus;

    @SerializedName("ReturnPathDomain")
    private String ReturnPathDomain;

    @SerializedName("ReturnPathDomainVerified")
    private boolean isReturnPathDomainVerified;

    @SerializedName("ReturnPathDomainCNAMEValue")
    private String ReturnPathDomainCNAMEValue;

}
