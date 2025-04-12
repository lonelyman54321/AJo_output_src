/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$array;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from yh0
 */
public final class yh0_0
extends jD3 {
    public final NO2 a;
    public final i23_0 b;
    public final ee2_2 c;
    public final i23_0 d;
    public final ee2_2 e;
    public final ArrayList f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;
    public final ParcelableSnapshotMutableState p;
    public final ParcelableSnapshotMutableState q;

    public yh0_0(NO2 object) {
        h23_0 h23_02;
        Intrinsics.checkNotNullParameter(object, "reviewRatingUseCase");
        this.a = object;
        int n3 = 7;
        this.b = h23_02 = k23_0.b(0, 0, null, n3);
        h23_02 = ms0_1.a(h23_02);
        this.c = h23_02;
        Object object2 = k23_0.b(0, 0, null, n3);
        this.d = object2;
        object2 = ms0_1.a((i23_0)object2);
        this.e = object2;
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a().getResources();
        int n4 = R$array.sort_reviews;
        object2 = object2.getStringArray(n4);
        Intrinsics.checkNotNullExpressionValue(object2, "getStringArray(...)");
        this.f = object2 = tp_2.N(object2);
        this.g = object = J83.g(CollectionsKt.N(0, (List)object2));
        object = Boolean.FALSE;
        this.h = object2 = J83.g(object);
        this.i = object2 = J83.g(object);
        this.j = object2 = J83.g(object2);
        this.k = object2 = J83.g(object);
        this.l = object2 = J83.g(object);
        this.m = object2 = J83.g(object);
        this.n = object2 = J83.g(object);
        super();
        this.o = object2 = J83.g(object2);
        this.p = object = J83.g(object);
        this.q = object = J83.g(-1);
        object = md3_0.c(this);
        super(this, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
        this.b();
    }

    public final void b() {
        this.a.getClass();
        ArrayList<OO2> arrayList = new ArrayList<OO2>();
        for (int i3 = 5; i3 > 0; i3 += -1) {
            String string2 = String.valueOf(i3);
            Boolean bl2 = Boolean.FALSE;
            OO2 oO2 = new OO2(string2, bl2);
            arrayList.add(oO2);
        }
        p83_0 p83_02 = new p83_0();
        p83_02.addAll(arrayList);
        this.j.setValue(p83_02);
    }

    public final HashMap c(String object) {
        Pair[] pairArray;
        Object object2 = "optionCode";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Pair pair = new Pair(object2, object);
        object = 20;
        object2 = new Pair("pageSize", object);
        object = (String)this.g.getValue();
        Object object3 = (String)this.f.get(0);
        boolean bl2 = kotlin.text.b.i((String)object, (String)object3, false);
        object = bl2 ? "likeCount" : "createdOn";
        object3 = new Pair("sortBy", object);
        object = new Pair("direction", "DESC");
        Pair[] pairArray2 = pairArray = this.o.getValue();
        pairArray = CollectionsKt.R((Iterable)pairArray, null, null, null, null, 63);
        pairArray2 = new Pair("rating", pairArray);
        pairArray = this.n.getValue();
        Pair pair2 = new Pair("verifiedReviews", pairArray);
        pairArray = this.m.getValue();
        Pair pair3 = new Pair("reviewsWithImages", pairArray);
        pairArray = new Pair[]{pair, object2, object3, object, pairArray2, pair2, pair3};
        return fh1_2.h(pairArray);
    }

    public final ee2_2 d(HashMap object, Boolean object2) {
        Object object3 = "query";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.a;
        object4.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object3 = new Kl2(20, 1, 54);
        io2_0 io2_02 = new io2_0((NO2)object4, (HashMap)object, (Boolean)object2);
        object = "config";
        Intrinsics.checkNotNullParameter(object3, (String)object);
        object2 = "pagingSourceFactory";
        Intrinsics.checkNotNullParameter(io2_02, (String)object2);
        Intrinsics.checkNotNullParameter(object3, (String)object);
        Intrinsics.checkNotNullParameter(io2_02, (String)object2);
        object4 = new sk2_1(io2_02, null);
        object = new sk2((Function1)object4, null, (Kl2)object3);
        object2 = md3_0.c(this);
        return BJ.a(((sk2)object).f, (aW)object2);
    }

    public final void e() {
        Serializable serializable = (Boolean)this.h.getValue();
        boolean bl2 = serializable;
        if (!bl2) {
            this.b();
            serializable = Boolean.FALSE;
            this.k.setValue(serializable);
            this.l.setValue(serializable);
            this.g();
            serializable = new ArrayList();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.o;
            parcelableSnapshotMutableState.setValue(serializable);
        }
    }

    public final void f(Integer n3) {
        aW aW2 = md3_0.c(this);
        yh0$a yh0$a = new yh0$a(this, n3, null);
        Ae3.d(aW2, null, null, yh0$a, 3);
    }

    public final void g() {
        Object object = this.k.getValue();
        this.m.setValue(object);
        object = this.l.getValue();
        this.n.setValue(object);
    }
}

