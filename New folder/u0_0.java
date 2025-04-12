/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from U0
 */
public final class u0_0
extends k0_0 {
    public final /* synthetic */ w0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ SerialDescriptor c;

    public u0_0(w0_0 w0_02, String string2, SerialDescriptor serialDescriptor) {
        this.a = w0_02;
        this.b = string2;
        this.c = serialDescriptor;
    }

    public final void N(String object) {
        Intrinsics.checkNotNullParameter(object, "value");
        SerialDescriptor serialDescriptor = this.c;
        tm1_1 tm1_12 = new tm1_1(object, false, serialDescriptor);
        object = this.a;
        String string2 = this.b;
        ((w0_0)object).V(string2, tm1_12);
    }

    public final i0_0 a() {
        return this.a.b.b;
    }
}

