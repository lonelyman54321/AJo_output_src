/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

public final class XP2 {
    public final KSerializer a;
    public final String b;
    public String c;
    public String d;

    public XP2(KSerializer object) {
        String string2;
        Intrinsics.checkNotNullParameter(object, "serializer");
        this.c = string2 = "";
        this.d = string2;
        this.a = object;
        this.b = object = object.getDescriptor().h();
    }
}

