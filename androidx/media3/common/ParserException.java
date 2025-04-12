/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

import java.io.IOException;

public class ParserException
extends IOException {
    public final boolean a;
    public final int b;

    public ParserException(String string2, RuntimeException runtimeException, boolean bl2, int n3) {
        super(string2, runtimeException);
        this.a = bl2;
        this.b = n3;
    }

    public static ParserException a(String string2, RuntimeException runtimeException) {
        int n3 = 1;
        ParserException parserException = new ParserException(string2, runtimeException, n3 != 0, n3);
        return parserException;
    }

    public static ParserException b(String string2) {
        ParserException parserException = new ParserException(string2, null, false, 1);
        return parserException;
    }

    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = super.getMessage();
        stringBuilder.append(string2);
        stringBuilder.append(" {contentIsMalformed=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", dataType=");
        return g30.a(this.b, "}", stringBuilder);
    }
}

