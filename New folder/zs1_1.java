/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import androidx.navigation.i;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ZS1
 */
public final class zs1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ e c;

    public zs1_1(e e2) {
        this.c = e2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (i)object;
        Intrinsics.checkNotNullParameter(object, "destination");
        LinkedHashMap linkedHashMap = this.c.m;
        object = ((i)object).g;
        return linkedHashMap.containsKey(object) ^ true;
    }
}

