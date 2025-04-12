/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.IFilter;
import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.b;

/*
 * Renamed from jN0
 */
public final class jn0_2
implements Function1 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ CouponAttributeValues b;
    public final /* synthetic */ IFilter c;
    public final /* synthetic */ p83_0 d;

    public /* synthetic */ jn0_2(ob0_1 ob0_12, CouponAttributeValues couponAttributeValues, IFilter iFilter, p83_0 p83_02) {
        this.a = ob0_12;
        this.b = couponAttributeValues;
        this.c = iFilter;
        this.d = p83_02;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = object;
        object2 = (Boolean)object;
        boolean bl2 = (Boolean)object2;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "$viewModel");
        Object object4 = this.b;
        Intrinsics.checkNotNullParameter(object4, "$filterAttribute");
        Object object5 = this.d;
        Intrinsics.checkNotNullParameter(object5, "$filters");
        object3.getClass();
        Intrinsics.checkNotNullParameter(object4, "couponAttribute");
        IFilter iFilter = this.c;
        Intrinsics.checkNotNullParameter(iFilter, "currentlySelectedFilter");
        Object object6 = "filters";
        Intrinsics.checkNotNullParameter(object5, (String)object6);
        int n4 = ((p83_0)object5).indexOf(iFilter);
        int n7 = -1;
        if (n4 != n7) {
            int n8 = 7;
            int n10 = 0;
            int n14 = 0;
            String string2 = null;
            String string3 = null;
            object6 = iFilter;
            int n15 = -1;
            n7 = 0;
            object6 = IFilter.copy$default(iFilter, null, null, false, n8, null);
            ((p83_0)object5).remove(n4);
            Object object7 = ((IFilter)object6).getCouponAttributeValues();
            if (object7 != null && (n10 = ((p83_0)object7).indexOf(object4)) != n15) {
                n15 = 0;
                n14 = 3;
                Object object8 = CouponAttributeValues.copy$default((CouponAttributeValues)object4, null, null, n14, null);
                object4 = ((IFilter)object6).getCouponAttributeValues();
                Intrinsics.checkNotNull(object4);
                ((p83_0)object4).remove(n10);
                ((CouponAttributeValues)object8).setSelected((Boolean)object2);
                object2 = ((IFilter)object6).getCouponAttributeValues();
                Intrinsics.checkNotNull(object2);
                ((p83_0)object2).add(n10, object8);
                ((p83_0)object5).add(n4, object6);
                ((ob0_1)object3).m.setValue(object5);
                Intrinsics.checkNotNullParameter(object6, "filter");
                ((ob0_1)object3).n.setValue(object6);
                object2 = ((ob0_1)object3).z;
                object3 = iFilter.getKey();
                boolean bl3 = object2.containsKey(object3);
                if (!bl3 && bl2) {
                    String string4 = iFilter.getKey();
                    Intrinsics.checkNotNull(string4);
                    Object object9 = new CouponAttributeValues[n3];
                    bl3 = false;
                    object3 = null;
                    object9[0] = object8;
                    object8 = new p83_0();
                    object9 = tp_2.M(object9);
                    ((p83_0)object8).addAll((Collection)object9);
                    object2.put(string4, object8);
                } else {
                    object3 = new p83_0();
                    object4 = iFilter.getKey();
                    if ((object4 = (p83_0)((LinkedHashMap)object2).get(object4)) != null) {
                        object5 = ((p83_0)object4).listIterator();
                        boolean bl4 = false;
                        object6 = null;
                        while (true) {
                            object7 = object5;
                            object7 = (ob3_2)object5;
                            n14 = (int)(((ob3_2)object7).hasNext() ? 1 : 0);
                            if (n14 == 0) break;
                            object7 = (CouponAttributeValues)((ob3_2)object7).next();
                            string2 = ((CouponAttributeValues)object7).getValue();
                            string3 = ((CouponAttributeValues)object8).getValue();
                            n8 = 0;
                            n14 = (int)(kotlin.text.b.i(string2, string3, false) ? 1 : 0);
                            if (n14 == 0) continue;
                            if (!bl2) {
                                ((p83_0)object3).add(object7);
                            }
                            bl4 = true;
                        }
                        ((p83_0)object4).removeAll((Collection)object3);
                        n3 = (int)(((p83_0)object4).isEmpty() ? 1 : 0);
                        if (n3 != 0) {
                            String string5 = iFilter.getKey();
                            object3 = TypeIntrinsics.asMutableMap(object2);
                            object3.remove(string5);
                        } else {
                            String string6 = iFilter.getKey();
                            Intrinsics.checkNotNull(string6);
                            object2.put(string6, object4);
                        }
                        if (!bl4 && bl2) {
                            ((p83_0)object4).add(object8);
                            object8 = iFilter.getKey();
                            Intrinsics.checkNotNull(object8);
                            object2.put(object8, object4);
                        }
                    }
                }
            }
        }
        return Unit.a;
    }
}

