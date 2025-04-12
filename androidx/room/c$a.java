/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import kotlin.jvm.internal.Intrinsics;

public final class c$a {
    public static String a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "tableName");
        Intrinsics.checkNotNullParameter(string3, "triggerType");
        StringBuilder stringBuilder = new StringBuilder("`room_table_modification_trigger_");
        stringBuilder.append(string2);
        stringBuilder.append('_');
        stringBuilder.append(string3);
        stringBuilder.append('`');
        return stringBuilder.toString();
    }
}

