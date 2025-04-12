/*
 * Decompiled with CFR 0.152.
 */
import java.lang.constant.Constable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SB3
 */
public final class sb3_2 {
    public String a;
    public Integer b;
    public Long c;
    public boolean d;
    public final boolean e;
    public final float f;
    public Boolean g;
    public Boolean h;

    public sb3_2() {
        this(null, null, null, false, 0.0f, null, null, 255);
    }

    public sb3_2(String string2, Integer n3, Long l2, boolean bl2, float f5, Boolean bl3, Boolean bl4, int n4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = 0;
        }
        if ((n7 = n4 & 4) != 0) {
            long l3 = 0L;
            l2 = l3;
        }
        if ((n7 = n4 & 8) != 0) {
            bl2 = false;
        }
        if ((n7 = n4 & 0x20) != 0) {
            f5 = 0.0f;
        }
        if ((n7 = n4 & 0x40) != 0) {
            bl3 = null;
        }
        if ((n4 &= 0x80) != 0) {
            bl4 = null;
        }
        this.a = string2;
        this.b = n3;
        this.c = l2;
        this.d = bl2;
        this.e = false;
        this.f = f5;
        this.g = bl3;
        this.h = bl4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof sb3_2;
        if (n3 == 0) {
            return false;
        }
        object = (sb3_2)object;
        Object object2 = this.a;
        Object object3 = ((sb3_2)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.b;
        object3 = ((sb3_2)object).b;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.c;
        object3 = ((sb3_2)object).c;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.d;
        int n4 = ((sb3_2)object).d;
        if (n3 != n4) {
            return false;
        }
        n3 = this.e;
        n4 = ((sb3_2)object).e;
        if (n3 != n4) {
            return false;
        }
        float f5 = this.f;
        float f6 = ((sb3_2)object).f;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        object2 = this.g;
        object3 = ((sb3_2)object).g;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.h;
        object = ((sb3_2)object).h;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5;
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        int n8 = 31;
        n4 *= 31;
        Constable constable = this.b;
        if (constable == null) {
            n3 = 0;
            f5 = 0.0f;
            constable = null;
        } else {
            n3 = constable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        constable = this.c;
        if (constable == null) {
            n3 = 0;
            f5 = 0.0f;
            constable = null;
        } else {
            n3 = constable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.d ? 1 : 0);
        int n10 = 1237;
        if (n3 != 0) {
            n3 = 1231;
            f5 = 1.725E-42f;
        } else {
            n3 = 1237;
            f5 = 1.733E-42f;
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.e ? 1 : 0);
        if (n3 != 0) {
            n10 = 1231;
        }
        n4 = (n4 + n10) * 31;
        f5 = this.f;
        n4 = UR0.a(f5, n4, n8);
        constable = this.g;
        if (constable == null) {
            n3 = 0;
            f5 = 0.0f;
            constable = null;
        } else {
            n3 = constable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        Boolean bl2 = this.h;
        if (bl2 != null) {
            n7 = ((Object)bl2).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        String string2 = this.a;
        Integer n3 = this.b;
        Long l2 = this.c;
        boolean bl2 = this.d;
        Boolean bl3 = this.g;
        Boolean bl4 = this.h;
        StringBuilder stringBuilder = new StringBuilder("VideoModel(videoUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", currentState=");
        stringBuilder.append(n3);
        stringBuilder.append(", playbackPosition=");
        stringBuilder.append(l2);
        stringBuilder.append(", isMuted=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isPaused=");
        boolean bl5 = this.e;
        stringBuilder.append(bl5);
        stringBuilder.append(", volume=");
        float f5 = this.f;
        stringBuilder.append(f5);
        stringBuilder.append(", muteOnFullScreen=");
        stringBuilder.append(bl3);
        stringBuilder.append(", muteOnMinimizedScreen=");
        stringBuilder.append(bl4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

