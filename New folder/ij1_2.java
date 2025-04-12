/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.payment.utils.InternalWalletUtil;
import com.ril.ajio.services.data.Payment.InternalWalletDataHolder;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.b;

/*
 * Renamed from Ij1
 */
public final class ij1_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PaymentInstruments c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;

    public ij1_2(PaymentInstruments paymentInstruments, boolean bl2, List list, f80_0 f80_02) {
        this.c = paymentInstruments;
        this.d = bl2;
        this.e = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.d;
        List list = this.e;
        PaymentInstruments paymentInstruments = this.c;
        ij1_2 ij1_22 = new ij1_2(paymentInstruments, bl2, list, f80_02);
        ij1_22.b = object;
        return ij1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (ij1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ij1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        int n3;
        Object object3;
        String string2;
        Object object4;
        Object object5;
        int n4;
        Object object6;
        int n7;
        int n8;
        Object object7;
        Object object8;
        boolean bl2;
        int n10;
        Iterator iterator;
        Object object9;
        Ref$IntRef ref$IntRef;
        int n14;
        Ref$IntRef ref$IntRef2;
        fs0_2 fs0_22;
        j90_0 j90_02;
        float f5;
        int n15;
        ij1_2 ij1_22;
        block30: {
            ij1_22 = this;
            n15 = 1;
            f5 = Float.MIN_VALUE;
            j90_02 = j90_0.COROUTINE_SUSPENDED;
            int n16 = this.a;
            if (n16 != 0) {
                if (n16 == n15) {
                    vl2_2.b(object);
                    return Unit.a;
                }
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            vl2_2.b(object);
            fs0_22 = (fs0_2)this.b;
            ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = n14 = -1;
            ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = n14;
            object9 = new Ref$IntRef();
            ((Ref$IntRef)object9).element = n14;
            Iterator iterator2 = ((Iterable)this.e).iterator();
            int n17 = 0;
            iterator = null;
            while (true) {
                n10 = iterator2.hasNext();
                bl2 = false;
                object8 = null;
                if (n10 == 0) break block30;
                object7 = iterator2.next();
                n8 = n17 + 1;
                if (n17 < 0) break;
                object7 = (qq2_2)object7;
                InternalWalletUtil.a.getClass();
                object8 = (HashSet)InternalWalletUtil.c.getValue();
                n7 = ((qq2_2)object7).a;
                object6 = new Integer(n7);
                bl2 = ((HashSet)object8).contains(object6);
                if (bl2) {
                    n10 = ref$IntRef2.element;
                    if (n10 == n14) {
                        ref$IntRef2.element = n17;
                    } else {
                        ref$IntRef.element = n17;
                    }
                } else {
                    n10 = ((qq2_2)object7).a;
                    if (n10 == n15) {
                        ((Ref$IntRef)object9).element = n17;
                    }
                }
                n17 = n8;
            }
            xx_2.n();
            throw null;
        }
        int n18 = ref$IntRef2.element;
        if (n18 == n14) {
            ref$IntRef2.element = n4 = ((Ref$IntRef)object9).element + n15;
        }
        if ((n4 = ref$IntRef.element) == n14) {
            ref$IntRef.element = n14 = ref$IntRef2.element;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        InternalWalletUtil.a.getClass();
        object9 = go2_0.a;
        object9 = ij1_22.c;
        n18 = (int)(go2_0.a((PaymentInstruments)object9) ? 1 : 0);
        if (object9 != null && (iterator = ((PaymentInstruments)object9).getPaymentInstrumentDetails()) != null) {
            iterator = ((Iterable)((Object)iterator)).iterator();
            while ((n10 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                Object object10;
                object7 = (PaymentInstrumentType)iterator.next();
                if (object7 != null) {
                    object5 = ((PaymentInstrumentType)object7).getPaymentInstrumentCode();
                } else {
                    n8 = 0;
                    object5 = null;
                }
                if ((n8 = (int)(kotlin.text.b.i((String)object5, (String)(object10 = "INTERNAL_WALLET"), n15 != 0) ? 1 : 0)) == 0) continue;
                if (object7 == null || (iterator = ((PaymentInstrumentType)object7).getPaymentInstrumentsInfo()) == null) break;
                iterator = iterator.iterator();
                n10 = 0;
                object7 = null;
                while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object6 = object5 = iterator.next();
                    object6 = (PaymentInstrumentInfo)object5;
                    if (object6 != null && (object5 = ((PaymentInstrumentInfo)object6).getCode()) != null && (n7 = ((String)object5).length()) > 0) {
                        object10 = "AJIO_CASH_WALLET";
                        boolean bl3 = Intrinsics.areEqual(object5, object10);
                        if (!bl3 && ((bl2 = ij1_22.d) || (n15 = (int)(Intrinsics.areEqual(object8 = ((PaymentInstrumentInfo)object6).getErrorLoadingBalance(), object4 = Boolean.TRUE) ? 1 : 0)) != 0)) {
                            n15 = 32;
                            f5 = 4.5E-44f;
                            object4 = n15;
                        } else {
                            float f6;
                            object4 = ((PaymentInstrumentInfo)object6).getAvailableAmount();
                            bl2 = false;
                            object8 = null;
                            if (object4 != null) {
                                f5 = ((Float)object4).floatValue();
                            } else {
                                n15 = 0;
                                f5 = 0.0f;
                                object4 = null;
                            }
                            n15 = (int)((f6 = f5 - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                            if (n15 > 0) {
                                n15 = 31;
                                f5 = 4.3E-44f;
                                object4 = n15;
                            } else {
                                n15 = 0;
                                f5 = 0.0f;
                                object4 = null;
                            }
                        }
                        if (object4 != null) {
                            bl2 = Intrinsics.areEqual(object5, object10);
                            if (!bl2) {
                                n10 = 1;
                            }
                            bl3 = false;
                            string2 = null;
                            object3 = null;
                            n3 = 12;
                            object5 = object10;
                            object2 = object10;
                            n7 = n18;
                            object10 = new InternalWalletDataHolder(n18 != 0, (PaymentInstrumentInfo)object6, null, null, n3, null);
                            n15 = (Integer)object4;
                            object8 = new qq2_2((InternalWalletDataHolder)object10, n15);
                            arrayList.add(object8);
                        }
                    }
                    n15 = 1;
                    f5 = Float.MIN_VALUE;
                    bl2 = false;
                    object8 = null;
                }
                break;
            }
        } else {
            n10 = 0;
            object7 = null;
        }
        if (n10 == 0) {
            if (object9 != null) {
                object4 = ((PaymentInstruments)object9).getDisplayAjioWalletAboveLoader();
                object2 = Boolean.TRUE;
                n15 = (int)(Intrinsics.areEqual(object4, object2) ? 1 : 0);
            } else {
                n15 = 0;
                f5 = 0.0f;
                object4 = null;
            }
            int n19 = 33;
            if (n15 != 0) {
                n10 = R$string.loyalty_pts;
                string2 = hv3_0.K(n10);
                object3 = ((PaymentInstruments)object9).getLoyaltyPointsInfo();
                n3 = 2;
                object6 = null;
                object5 = iterator;
                n7 = n18;
                iterator = new Iterator(n18 != 0, null, string2, (String)object3, n3, null);
                object4 = new qq2_2((InternalWalletDataHolder)((Object)iterator), n19);
                arrayList.add(object4);
            } else {
                n10 = R$string.loyalty_pts;
                string2 = hv3_0.K(n10);
                object3 = object9 != null ? (object8 = ((PaymentInstruments)object9).getLoyaltyPointsInfo()) : null;
                n3 = 2;
                object6 = null;
                object5 = iterator;
                n7 = n18;
                iterator = new Iterator(n18 != 0, null, string2, (String)object3, n3, null);
                object4 = new qq2_2((InternalWalletDataHolder)((Object)iterator), n19);
                n4 = 0;
                object9 = null;
                arrayList.add(0, object4);
            }
        }
        int n20 = ref$IntRef2.element;
        int n21 = ref$IntRef.element;
        object4 = new Object();
        ((jj1_2)object4).a = n20;
        ((jj1_2)object4).b = n21;
        ((jj1_2)object4).c = arrayList;
        ij1_22.a = n20 = 1;
        if ((object4 = fs0_22.emit(object4, ij1_22)) != j90_02) return Unit.a;
        return j90_02;
    }
}

