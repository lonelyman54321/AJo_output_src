/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pj0
 */
public final class pj0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ pj0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object stringArray) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((Boolean)stringArray).booleanValue();
                return Unit.a;
            }
            case 1: {
                stringArray = (String)stringArray;
                String string2 = ",";
                stringArray = stringArray.split(string2);
                int n4 = stringArray.length;
                n3 = 2;
                if (n4 == n3) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    stringArray = null;
                }
                return n4 != 0;
            }
            case 0: 
        }
        stringArray = (o)stringArray;
        Intrinsics.checkNotNullParameter(stringArray, "$this$navigate");
        rj0_2 rj0_22 = new Object();
        stringArray.a("home", rj0_22);
        n3 = 1;
        stringArray.b = n3;
        stringArray.c = n3;
        return Unit.a;
    }
}

