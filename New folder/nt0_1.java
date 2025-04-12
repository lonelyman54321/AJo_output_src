/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderTracker;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nt0
 */
public final class nt0_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ReturnOrderTracker h;
    public final /* synthetic */ Boolean i;
    public final /* synthetic */ Boolean j;
    public final /* synthetic */ ReturnOrderTracker k;
    public final /* synthetic */ CartEntry l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ nt0_1(qz1_2 qz1_22, String string2, String string3, String string4, String string5, ArrayList arrayList, boolean bl2, ReturnOrderTracker returnOrderTracker, Boolean bl3, Boolean bl4, ReturnOrderTracker returnOrderTracker2, CartEntry cartEntry, int n3, int n4, int n7) {
        this.a = qz1_22;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = arrayList;
        this.g = bl2;
        this.h = returnOrderTracker;
        this.i = bl3;
        this.j = bl4;
        this.k = returnOrderTracker2;
        this.l = cartEntry;
        this.m = n3;
        this.n = n4;
        this.o = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        ((Integer)object2).intValue();
        Object object5 = this.a;
        Intrinsics.checkNotNullParameter(object5, "$viewModel");
        int n3 = Me3.b(this.m | 1);
        int n4 = Me3.b(this.n);
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        Object object6 = this.e;
        ArrayList arrayList = this.f;
        boolean bl2 = this.g;
        Serializable serializable = this.h;
        Boolean bl3 = this.i;
        Serializable serializable2 = this.j;
        Object object7 = this.k;
        object4 = this.l;
        int n7 = n4;
        n4 = this.o;
        Object object8 = object4;
        object4 = object5;
        object5 = string2;
        string2 = string3;
        string3 = string4;
        string4 = object6;
        object6 = arrayList;
        ReturnOrderTracker returnOrderTracker = serializable;
        serializable = bl3;
        bl3 = serializable2;
        serializable2 = object7;
        object7 = object8;
        int n8 = n4;
        n4 = n7;
        ut0_1.a((qz1_2)object4, (String)object5, string2, string3, string4, arrayList, bl2, returnOrderTracker, (Boolean)serializable, bl3, (ReturnOrderTracker)serializable2, (CartEntry)object8, (b30_0)object3, n3, n7, n8);
        return Unit.a;
    }
}

