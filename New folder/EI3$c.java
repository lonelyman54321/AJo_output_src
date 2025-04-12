/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class EI3$c {
    public final String a;
    public final hI3$b b;
    public final b c;
    public final long d;
    public final long e;
    public final long f;
    public final b60 g;
    public final int h;
    public final Au i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public EI3$c(String string2, hI3$b hI3$b, b b2, long l2, long l3, long l4, b60 b602, int n3, Au au4, long l7, long l8, int n4, int n7, long l12, int n8, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter((Object)hI3$b, "state");
        Intrinsics.checkNotNullParameter(b2, "output");
        Intrinsics.checkNotNullParameter(b602, "constraints");
        Intrinsics.checkNotNullParameter((Object)au4, "backoffPolicy");
        Intrinsics.checkNotNullParameter(arrayList, "tags");
        Intrinsics.checkNotNullParameter(arrayList2, "progress");
        this.a = string2;
        this.b = hI3$b;
        this.c = b2;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = b602;
        this.h = n3;
        this.i = au4;
        this.j = l7;
        this.k = l8;
        this.l = n4;
        this.m = n7;
        this.n = l12;
        this.o = n8;
        this.p = arrayList;
        this.q = arrayList2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof EI3$c;
        if (n3 == 0) {
            return false;
        }
        object = (EI3$c)object;
        Object object2 = this.a;
        Object object3 = ((EI3$c)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((EI3$c)object).b;
        if (object3 != object2) {
            return false;
        }
        object3 = this.c;
        object2 = ((EI3$c)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        long l2 = this.d;
        long l3 = ((EI3$c)object).d;
        long l4 = l2 - l3;
        n3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.e;
        l3 = ((EI3$c)object).e;
        long l7 = l2 - l3;
        n3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.f;
        l3 = ((EI3$c)object).f;
        long l8 = l2 - l3;
        n3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        object3 = this.g;
        object2 = ((EI3$c)object).g;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.h;
        int n4 = ((EI3$c)object).h;
        if (n3 != n4) {
            return false;
        }
        object3 = this.i;
        object2 = ((EI3$c)object).i;
        if (object3 != object2) {
            return false;
        }
        l2 = this.j;
        l3 = ((EI3$c)object).j;
        long l12 = l2 - l3;
        n3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        l2 = this.k;
        l3 = ((EI3$c)object).k;
        long l14 = l2 - l3;
        n3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        n3 = this.l;
        n4 = ((EI3$c)object).l;
        if (n3 != n4) {
            return false;
        }
        n3 = this.m;
        n4 = ((EI3$c)object).m;
        if (n3 != n4) {
            return false;
        }
        l2 = this.n;
        l3 = ((EI3$c)object).n;
        long l15 = l2 - l3;
        n3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (n3 != 0) {
            return false;
        }
        n3 = this.o;
        n4 = ((EI3$c)object).o;
        if (n3 != n4) {
            return false;
        }
        object3 = this.p;
        object2 = ((EI3$c)object).p;
        n3 = Intrinsics.areEqual(object3, object2) ? 1 : 0;
        if (n3 == 0) {
            return false;
        }
        object3 = this.q;
        object = ((EI3$c)object).q;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (((Object)((Object)this.b)).hashCode() + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        long l2 = this.d;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.e;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.f;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        n4 = (this.g.hashCode() + n3) * 31;
        n3 = this.h;
        n4 = (n4 + n3) * 31;
        n3 = (((Object)((Object)this.i)).hashCode() + n4) * 31;
        l2 = this.j;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.k;
        l3 = l2 >>> n7;
        n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        n4 = this.l;
        n3 = (n3 + n4) * 31;
        n4 = this.m;
        n3 = (n3 + n4) * 31;
        l2 = this.n;
        long l4 = l2 >>> n7;
        n8 = (int)(l2 ^ l4);
        n3 = (n3 + n8) * 31;
        n4 = this.o;
        n3 = (n3 + n4) * 31;
        List list = this.p;
        n3 = ne_0.a(n3, 31, list);
        return ((Object)this.q).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WorkInfoPojo(id=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", state=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", output=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", initialDelay=");
        long l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", intervalDuration=");
        l2 = this.e;
        stringBuilder.append(l2);
        stringBuilder.append(", flexDuration=");
        l2 = this.f;
        stringBuilder.append(l2);
        stringBuilder.append(", constraints=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", runAttemptCount=");
        int n3 = this.h;
        stringBuilder.append(n3);
        stringBuilder.append(", backoffPolicy=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", backoffDelayDuration=");
        l2 = this.j;
        stringBuilder.append(l2);
        stringBuilder.append(", lastEnqueueTime=");
        l2 = this.k;
        stringBuilder.append(l2);
        stringBuilder.append(", periodCount=");
        n3 = this.l;
        stringBuilder.append(n3);
        stringBuilder.append(", generation=");
        n3 = this.m;
        stringBuilder.append(n3);
        stringBuilder.append(", nextScheduleTimeOverride=");
        l2 = this.n;
        stringBuilder.append(l2);
        stringBuilder.append(", stopReason=");
        n3 = this.o;
        stringBuilder.append(n3);
        stringBuilder.append(", tags=");
        object = this.p;
        stringBuilder.append(object);
        stringBuilder.append(", progress=");
        object = this.q;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

