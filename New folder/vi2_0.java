/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vI2
 */
public final class vi2_0
extends Lambda
implements Function0 {
    public final /* synthetic */ as2_1 c;
    public final /* synthetic */ BS2 d;
    public final /* synthetic */ iS2 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object[] h;

    public vi2_0(as2_1 as2_12, BS2 bS2, iS2 iS22, String string2, Object object, Object[] objectArray) {
        this.c = as2_12;
        this.d = bS2;
        this.e = iS22;
        this.f = string2;
        this.g = object;
        this.h = objectArray;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        as2_1 as2_12 = this.c;
        Object object = as2_12.b;
        Object object2 = this.e;
        boolean bl3 = true;
        if (object != object2) {
            as2_12.b = object2;
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        object2 = as2_12.c;
        String string2 = this.f;
        boolean bl4 = Intrinsics.areEqual(object2, string2);
        if (!bl4) {
            as2_12.c = string2;
        } else {
            bl3 = bl2;
        }
        as2_12.a = object = this.d;
        as2_12.d = object = this.g;
        object = this.h;
        as2_12.e = object;
        object = as2_12.f;
        if (object != null && bl3) {
            object.unregister();
            bl2 = false;
            object = null;
            as2_12.f = null;
            as2_12.b();
        }
        return Unit.a;
    }
}

