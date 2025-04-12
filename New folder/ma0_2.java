/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

/*
 * Renamed from MA0
 */
public final class ma0_2
implements Function0 {
    public final /* synthetic */ na0_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ma0_2(na0_2 na0_22, String string2) {
        this.a = na0_22;
        this.b = string2;
    }

    public final Object invoke() {
        Enum[] enumArray = this.a;
        enumArray.getClass();
        enumArray = enumArray.a;
        int n3 = enumArray.length;
        String string2 = this.b;
        fa0_2 fa0_22 = new fa0_2(string2, n3);
        n3 = enumArray.length;
        string2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = enumArray[i3].name();
            fa0_22.j(string3, false);
        }
        return fa0_22;
    }
}

