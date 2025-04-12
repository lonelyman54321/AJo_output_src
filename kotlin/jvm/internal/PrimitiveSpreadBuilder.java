/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.c;

public abstract class PrimitiveSpreadBuilder {
    private int position;
    private final int size;
    private final Object[] spreads;

    public PrimitiveSpreadBuilder(int n3) {
        this.size = n3;
        Object[] objectArray = new Object[n3];
        this.spreads = objectArray;
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(Object object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "spreadArgument");
        Object[] objectArray = this.spreads;
        int n4 = this.position;
        this.position = n3 = n4 + 1;
        objectArray[n4] = object;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(Object var1);

    public final void setPosition(int n3) {
        this.position = n3;
    }

    public final int size() {
        int n3 = this.size;
        int n4 = 1;
        int n7 = 0;
        KMappedMarker kMappedMarker = new c(0, n3 -= n4, n4);
        kMappedMarker = ((c)kMappedMarker).d();
        while ((n3 = (int)(((ui1_2)kMappedMarker).c ? 1 : 0)) != 0) {
            Object[] objectArray = this.spreads;
            n3 = ((ui1_2)kMappedMarker).nextInt();
            Object object = objectArray[n3];
            n3 = object != null ? this.getSize(object) : 1;
            n7 += n3;
        }
        return n7;
    }

    public final Object toArray(Object object, Object object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "values");
        Intrinsics.checkNotNullParameter(object2, "result");
        int n4 = this.size;
        int n7 = 1;
        KMappedMarker kMappedMarker = new c(0, n4 -= n7, n7);
        kMappedMarker = ((c)kMappedMarker).d();
        n4 = 0;
        n7 = 0;
        while ((n3 = ((ui1_2)kMappedMarker).c) != 0) {
            n3 = ((ui1_2)kMappedMarker).nextInt();
            Object object3 = this.spreads[n3];
            if (object3 == null) continue;
            if (n4 < n3) {
                int n8 = n3 - n4;
                System.arraycopy(object, n4, object2, n7, n8);
                n7 += n8;
            }
            n4 = this.getSize(object3);
            System.arraycopy(object3, 0, object2, n7, n4);
            n7 += n4;
            n4 = n3 + 1;
        }
        int n10 = this.size;
        if (n4 < n10) {
            System.arraycopy(object, n4, object2, n7, n10 -= n4);
        }
        return object2;
    }
}

