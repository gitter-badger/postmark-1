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

package com.postmark.java.exception;

import com.postmark.java.response.PostmarkResponse;

/**
 * @author Saurabh Sejpal
 * @version 1.0
 * @since 1.0
 */
public class PostmarkException extends Exception {

    private static final long serialVersionUID = 8742554283535762204L;

    private PostmarkResponse response;

    public PostmarkException(Throwable cause) {
        super(cause);
    }

    public PostmarkException(String message) {
        super(message);
    }

    public PostmarkException(String message, PostmarkResponse response) {
        super(message);

        this.response = response;
    }

    public PostmarkResponse getResponse()
    {
        return response;
    }


}
