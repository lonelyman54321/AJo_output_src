/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class r23
implements DialogInterface.OnClickListener {
    public final /* synthetic */ B23 a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ r23(B23 b23, ArrayList arrayList) {
        this.a = b23;
        this.b = arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(DialogInterface object, int n3) {
        Object object2 = B23.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.b;
        Object object4 = "$selectedPositions";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object.dismiss();
        object = ((B23)object2).h;
        if (object != null) {
            Object object5;
            Object object6;
            int n4;
            ((B23)object2).Ra().fswmdProgressView.show();
            object = ((B23)object2).c;
            int n7 = 0;
            object4 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeViewModel");
                object = null;
            }
            if ((object2 = ((B23)object2).h) == null) {
                object2 = "sharedWithMe";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object4 = object2;
            }
            object2 = ((SharedWithMe)object4).getProductsShared();
            object.getClass();
            Intrinsics.checkNotNullParameter(object3, "selectedPositions");
            Intrinsics.checkNotNullParameter(object2, "productsShared");
            object4 = new ArrayList();
            object3 = object3.iterator();
            while ((n4 = object3.hasNext()) != 0) {
                object6 = (String)object3.next();
                object5 = object2;
                try {
                    Object t3;
                    Object object7;
                    boolean bl2;
                    object5 = (Iterable)object2;
                    object5 = object5.iterator();
                    do {
                        boolean bl3;
                        if (!(bl3 = object5.hasNext())) {
                            object5 = "Collection contains no element matching the predicate.";
                            object6 = new NoSuchElementException((String)object5);
                            throw object6;
                        }
                        t3 = object5.next();
                        object7 = t3;
                        object7 = (ListShareProductExperience)t3;
                    } while (!(bl2 = Intrinsics.areEqual(object7 = ((ListShareProductExperience)object7).getProductId(), object6)));
                    ((ArrayList)object4).add(t3);
                    continue;
                }
                catch (NoSuchElementException noSuchElementException) {}
                object5 = yn3_0.a;
                ((yn3$a)object5).e(noSuchElementException);
            }
            object2 = g53_0.d(CollectionsKt.k0(object4));
            Intrinsics.checkNotNullExpressionValue(object2, "just(...)");
            object3 = qt2_2.b;
            object2 = ((g53_0)object2).h((Scheduler)object3);
            n7 = 1;
            object3 = new tz_0(object, n7);
            object4 = new q23_0((tz_0)object3);
            n4 = 3;
            object3 = new ul_2(object, n4);
            object5 = null;
            object6 = new r23_0(0, (Function1)object3);
            object2 = ((g53_0)object2).f((o60_0)object4, (o60_0)object6);
            object = ((w23_0)object).e;
            ((t30_0)object).b((yr0_2)object2);
        }
    }
}

