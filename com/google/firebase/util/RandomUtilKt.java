/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.util;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.c;
import kotlin.ranges.f;

public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final String nextAlphanumericString(cd2_2 object, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 >= 0) {
            char c2;
            KMappedMarker kMappedMarker = f.m(0, n3);
            int c22 = yx_2.o((Iterable)((Object)kMappedMarker), 10);
            ArrayList<Object> arrayList = new ArrayList<Object>(c22);
            kMappedMarker = ((c)kMappedMarker).d();
            while ((c2 = ((ui1_2)kMappedMarker).c) != '\u0000') {
                ((mi1_2)kMappedMarker).nextInt();
                Object object2 = ALPHANUMERIC_ALPHABET;
                Intrinsics.checkNotNullParameter(object2, string2);
                String string3 = "random";
                Intrinsics.checkNotNullParameter(object, string3);
                int n4 = ((String)object2).length();
                if (n4 != 0) {
                    n4 = ((String)object2).length();
                    n4 = ((cd2_2)object).c(n4);
                    c2 = ((String)object2).charAt(n4);
                    object2 = Character.valueOf(c2);
                    arrayList.add(object2);
                    continue;
                }
                object = new NoSuchElementException("Char sequence is empty.");
                throw object;
            }
            return CollectionsKt.R(arrayList, "", null, null, null, 62);
        }
        object = hj0_0.a(n3, "invalid length: ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }
}

