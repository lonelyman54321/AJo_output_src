/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets$Type;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.c;

final class CalculatedWindowInsetsType$animationFraction$2
extends Lambda
implements Function0 {
    final /* synthetic */ WindowInsets$Type[] $types;

    public CalculatedWindowInsetsType$animationFraction$2(WindowInsets$Type[] windowInsets$TypeArray) {
        this.$types = windowInsets$TypeArray;
        super(0);
    }

    public final Float invoke() {
        Object object = this.$types;
        int n3 = ((WindowInsets$Type[])object).length;
        if (n3 != 0) {
            n3 = 0;
            WindowInsets$Type windowInsets$Type = object[0];
            float f5 = windowInsets$Type.getAnimationFraction();
            Object object2 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            int n4 = ((WindowInsets$Type[])object).length;
            int n7 = 1;
            KMappedMarker kMappedMarker = new c(n7, n4 -= n7, n7);
            kMappedMarker = ((c)kMappedMarker).d();
            while ((n4 = (int)(((ui1_2)kMappedMarker).c ? 1 : 0)) != 0) {
                n4 = ((ui1_2)kMappedMarker).nextInt();
                object2 = object[n4];
                float f6 = object2.getAnimationFraction();
                f5 = Math.max(f5, f6);
            }
            return Float.valueOf(f5);
        }
        object = new NoSuchElementException();
        throw object;
    }
}

