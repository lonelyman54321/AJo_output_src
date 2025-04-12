/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

import java.util.Objects;

public class HttpException
extends RuntimeException {
    public HttpException(dl2_2 object) {
        Objects.requireNonNull(object, "response == null");
        CharSequence charSequence = new StringBuilder("HTTP ");
        object = ((dl2_2)object).a;
        int n3 = ((cl2_2)object).d;
        charSequence.append(n3);
        charSequence.append(" ");
        String string2 = ((cl2_2)object).c;
        charSequence.append(string2);
        charSequence = charSequence.toString();
        super((String)charSequence);
        int cfr_ignored_0 = ((cl2_2)object).d;
        object = ((cl2_2)object).c;
    }
}

