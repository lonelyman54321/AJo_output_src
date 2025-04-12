/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from mp3
 */
public final class mp3_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ mp3_0(String string2, String string3, int n3) {
        this.a = string2;
        this.b = string3;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.c | 1);
        String string2 = this.a;
        String string3 = this.b;
        np3.a(string2, string3, (b30_0)object, n3);
        return Unit.a;
    }
}

