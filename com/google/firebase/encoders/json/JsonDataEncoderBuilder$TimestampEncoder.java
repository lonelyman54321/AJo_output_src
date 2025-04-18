/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder$1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class JsonDataEncoderBuilder$TimestampEncoder
implements ValueEncoder {
    private static final DateFormat rfc339;

    static {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        rfc339 = simpleDateFormat;
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        simpleDateFormat.setTimeZone(timeZone);
    }

    private JsonDataEncoderBuilder$TimestampEncoder() {
    }

    public /* synthetic */ JsonDataEncoderBuilder$TimestampEncoder(JsonDataEncoderBuilder$1 jsonDataEncoderBuilder$1) {
        this();
    }

    public void encode(Date object, ValueEncoderContext valueEncoderContext) {
        object = rfc339.format((Date)object);
        valueEncoderContext.add((String)object);
    }
}

