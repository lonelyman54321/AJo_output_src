/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class hI3 {
    public final UUID a;
    public final hI3$b b;
    public final Set c;
    public final b d;
    public final b e;
    public final int f;
    public final int g;
    public final b60 h;
    public final long i;
    public final hI3$a j;
    public final long k;
    public final int l;

    public hI3(UUID uUID, hI3$b hI3$b, HashSet hashSet, b b2, b b3, int n3, int n4, b60 b602, long l2, hI3$a hI3$a, long l3, int n7) {
        Intrinsics.checkNotNullParameter(uUID, "id");
        Intrinsics.checkNotNullParameter((Object)hI3$b, "state");
        Intrinsics.checkNotNullParameter(hashSet, "tags");
        Intrinsics.checkNotNullParameter(b2, "outputData");
        Intrinsics.checkNotNullParameter(b3, "progress");
        Intrinsics.checkNotNullParameter(b602, "constraints");
        this.a = uUID;
        this.b = hI3$b;
        this.c = hashSet;
        this.d = b2;
        this.e = b3;
        this.f = n3;
        this.g = n4;
        this.h = b602;
        this.i = l2;
        this.j = hI3$a;
        this.k = l3;
        this.l = n7;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        int n3;
        if (this == object) {
            return true;
        }
        boolean bl2 = false;
        b b2 = null;
        if (object != null && (n3 = Intrinsics.areEqual(object3 = hI3.class, object2 = object.getClass())) != 0) {
            object = (hI3)object;
            n3 = this.f;
            int n4 = ((hI3)object).f;
            if (n3 != n4) {
                return false;
            }
            n3 = this.g;
            n4 = ((hI3)object).g;
            if (n3 != n4) {
                return false;
            }
            object2 = this.a;
            object3 = ((hI3)object).a;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            object2 = this.b;
            object3 = ((hI3)object).b;
            if (object2 != object3) {
                return false;
            }
            object2 = this.d;
            object3 = ((hI3)object).d;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            object2 = this.h;
            object3 = ((hI3)object).h;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            long l2 = this.i;
            long l3 = ((hI3)object).i;
            long l4 = l2 - l3;
            Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object4 != false) {
                return false;
            }
            object2 = this.j;
            object3 = ((hI3)object).j;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            l2 = this.k;
            l3 = ((hI3)object).k;
            long l7 = l2 - l3;
            object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object4 != false) {
                return false;
            }
            n3 = this.l;
            n4 = ((hI3)object).l;
            if (n3 != n4) {
                return false;
            }
            object2 = this.c;
            object3 = ((hI3)object).c;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 != 0) {
                b2 = this.e;
                object = ((hI3)object).e;
                bl2 = Intrinsics.areEqual(b2, object);
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a.hashCode() * 31;
        int n7 = (((Object)((Object)this.b)).hashCode() + n4) * 31;
        n4 = (this.d.hashCode() + n7) * 31;
        n7 = (((Object)this.c).hashCode() + n4) * 31;
        b b2 = this.e;
        n4 = (b2.hashCode() + n7) * 31;
        n7 = this.f;
        n4 = (n4 + n7) * 31;
        n7 = this.g;
        n4 = (n4 + n7) * 31;
        b60 b602 = this.h;
        n7 = (b602.hashCode() + n4) * 31;
        long l2 = this.i;
        n4 = 32;
        long l3 = l2 >>> n4;
        int n8 = (int)(l2 ^= l3);
        n7 = (n7 + n8) * 31;
        hI3$a hI3$a = this.j;
        if (hI3$a != null) {
            n3 = hI3$a.hashCode();
        } else {
            n3 = 0;
            hI3$a = null;
        }
        n7 = (n7 + n3) * 31;
        l2 = this.k;
        l3 = l2 >>> n4;
        n4 = (int)(l2 ^ l3);
        n7 = (n7 + n4) * 31;
        n4 = this.l;
        return n7 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WorkInfo{id='");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append("', state=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", outputData=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", tags=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", progress=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", runAttemptCount=");
        int n3 = this.f;
        stringBuilder.append(n3);
        stringBuilder.append(", generation=");
        n3 = this.g;
        stringBuilder.append(n3);
        stringBuilder.append(", constraints=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", initialDelayMillis=");
        long l2 = this.i;
        stringBuilder.append(l2);
        stringBuilder.append(", periodicityInfo=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", nextScheduleTimeMillis=");
        l2 = this.k;
        stringBuilder.append(l2);
        stringBuilder.append("}, stopReason=");
        n3 = this.l;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

