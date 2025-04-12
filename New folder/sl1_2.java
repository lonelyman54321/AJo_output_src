/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sl1
 */
public final class sl1_2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final su_1 p;

    public sl1_2(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, String string2, boolean bl8, boolean bl9, String string3, boolean bl10, boolean bl11, boolean bl12, boolean bl13, boolean bl14, su_1 su_12) {
        Intrinsics.checkNotNullParameter(string2, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(string3, "classDiscriminator");
        Intrinsics.checkNotNullParameter((Object)su_12, "classDiscriminatorMode");
        this.a = bl2;
        this.b = bl3;
        this.c = bl4;
        this.d = bl5;
        this.e = bl6;
        this.f = bl7;
        this.g = string2;
        this.h = bl8;
        this.i = bl9;
        this.j = string3;
        this.k = bl10;
        this.l = bl11;
        this.m = bl12;
        this.n = bl13;
        this.o = bl14;
        this.p = su_12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JsonConfiguration(encodeDefaults=");
        boolean bl2 = this.a;
        stringBuilder.append(bl2);
        stringBuilder.append(", ignoreUnknownKeys=");
        bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", isLenient=");
        bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", allowStructuredMapKeys=");
        bl2 = this.d;
        stringBuilder.append(bl2);
        stringBuilder.append(", prettyPrint=");
        bl2 = this.e;
        stringBuilder.append(bl2);
        stringBuilder.append(", explicitNulls=");
        bl2 = this.f;
        stringBuilder.append(bl2);
        stringBuilder.append(", prettyPrintIndent='");
        Object object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append("', coerceInputValues=");
        bl2 = this.h;
        stringBuilder.append(bl2);
        stringBuilder.append(", useArrayPolymorphism=");
        bl2 = this.i;
        stringBuilder.append(bl2);
        stringBuilder.append(", classDiscriminator='");
        object = this.j;
        stringBuilder.append((String)object);
        stringBuilder.append("', allowSpecialFloatingPointValues=");
        bl2 = this.k;
        stringBuilder.append(bl2);
        stringBuilder.append(", useAlternativeNames=");
        bl2 = this.l;
        stringBuilder.append(bl2);
        stringBuilder.append(", namingStrategy=null, decodeEnumsCaseInsensitive=");
        bl2 = this.m;
        stringBuilder.append(bl2);
        stringBuilder.append(", allowTrailingComma=");
        bl2 = this.n;
        stringBuilder.append(bl2);
        stringBuilder.append(", allowComments=");
        bl2 = this.o;
        stringBuilder.append(bl2);
        stringBuilder.append(", classDiscriminatorMode=");
        object = this.p;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

