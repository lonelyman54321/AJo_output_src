/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.uuid.Uuid$Companion
 */
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.a$a;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from xE
 */
public final class xe_1 {
    public static final void A(IntCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = yi1_2.a;
    }

    public static final void B(LongCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = mb1_2.a;
    }

    public static final void C(ShortCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = n43_0.a;
    }

    public static final void D(StringCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = pe3_2.a;
    }

    public static final void E(a$a object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = zw0_2.a;
    }

    public static final void F(Uuid.Companion object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = tz3_0.a;
    }

    public static final az_2 a() {
        return az_2.c;
    }

    public static final ye_2 b() {
        return ye_2.c;
    }

    public static final fs_2 c() {
        return fs_2.c;
    }

    public static final hs0_2 d() {
        return hs0_2.c;
    }

    public static final bs0_2 e() {
        return bs0_2.c;
    }

    public static final ki1_2 f() {
        return ki1_2.c;
    }

    public static final ip_2 g(KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "elementSerializer");
        ip_2 ip_22 = new ip_2(kSerializer);
        return ip_22;
    }

    public static final cb1_2 h() {
        return cb1_2.c;
    }

    public static final nu1_2 i(KSerializer kSerializer, KSerializer kSerializer2) {
        Intrinsics.checkNotNullParameter(kSerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer2, "valueSerializer");
        nu1_2 nu1_22 = new nu1_2(kSerializer, kSerializer2);
        return nu1_22;
    }

    public static final void j() {
    }

    public static final l43_0 k() {
        return l43_0.c;
    }

    public static final ft3_0 l() {
        return ft3_0.c;
    }

    public static final kt3_0 m() {
        return kt3_0.c;
    }

    public static final pt3_0 n() {
        return pt3_0.c;
    }

    public static final ou3_0 o() {
        return ou3_0.c;
    }

    public static final KSerializer p(KSerializer object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = object.getDescriptor();
        boolean bl2 = object2.b();
        if (!bl2) {
            object = object2 = new w52_0((KSerializer)object);
        }
        return object;
    }

    public static final aw3_0 q(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return aw3_0.b;
    }

    public static final void r(Ct3$a object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = gt3_0.a;
    }

    public static final void s(Ht3$a object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = lt3_0.a;
    }

    public static final void t(Mt3$a object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = qt3_0.a;
    }

    public static final void u(lu3$a object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = pu3_0.a;
    }

    public static final void v(BooleanCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = cz_2.a;
    }

    public static final void w(ByteCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = bf_2.a;
    }

    public static final void x(CharCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ks_2.a;
    }

    public static final void y(DoubleCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = os0_2.a;
    }

    public static final void z(FloatCompanionObject object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ks0_2.a;
    }
}

