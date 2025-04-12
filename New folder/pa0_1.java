/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.b$a;
import androidx.navigation.c;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pa0
 */
public final class pa0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ pa0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int c2 = this.a;
        switch (c2) {
            default: {
                object = (Pair)object;
                Intrinsics.checkNotNullParameter(object, "it");
                String cU1$j = (String)((Pair)object).a;
                object = ((Pair)object).b;
                if (object != null) {
                    object = String.valueOf(object);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(cU1$j);
                    char c3 = '=';
                    stringBuilder.append(c3);
                    stringBuilder.append((String)object);
                    cU1$j = stringBuilder.toString();
                }
                return cU1$j;
            }
            case 0: 
        }
        object = (c)object;
        Intrinsics.checkNotNullParameter(object, "$this$navArgument");
        cU1$j cU1$j = cU1.f;
        object.getClass();
        Intrinsics.checkNotNullParameter(cU1$j, "value");
        object = ((c)object).a;
        object.getClass();
        Intrinsics.checkNotNullParameter(cU1$j, "type");
        ((b$a)object).a = cU1$j;
        return Unit.a;
    }
}

