/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryOrderCancel;
import com.ril.ajio.services.utils.ServiceUtil;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Za2
 */
public final class za2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ db2_1 b;
    public final /* synthetic */ QueryOrderCancel c;

    public za2_2(db2_1 db2_12, QueryOrderCancel queryOrderCancel, f80_0 f80_02) {
        this.b = db2_12;
        this.c = queryOrderCancel;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        db2_1 db2_12 = this.b;
        QueryOrderCancel queryOrderCancel = this.c;
        object = new za2_2(db2_12, queryOrderCancel, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (za2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((za2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        za2_2 za2_22 = this;
        int n3 = 1;
        int n4 = 2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n7 = this.a;
        if (n7 != 0) {
            if (n7 != n3 && n7 != n4) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            Object object3 = h40_0.a;
            n7 = (int)(h40_0.Q0() ? 1 : 0);
            Object object4 = "OrderDetailRepo";
            String string2 = "qtyCanceled";
            Object object5 = "cancelComment";
            Object object6 = "";
            String string3 = "cancellationReason";
            String string4 = "&";
            String string5 = "?fields=";
            String string6 = "order";
            Object object7 = "queryOrderCancel";
            Object object8 = this.c;
            Object[] objectArray = this.b;
            if (n7 != 0) {
                int n8;
                Object object9;
                Object object10;
                Object object11;
                Object object12;
                String string7;
                block30: {
                    block29: {
                        block28: {
                            block27: {
                                object3 = objectArray.a;
                                string7 = ServiceUtil.getToken(objectArray.c());
                                object3.getClass();
                                Intrinsics.checkNotNullParameter(object8, (String)object7);
                                object7 = new Ref$ObjectRef();
                                object12 = UrlHelper.Companion.getInstance();
                                object11 = ((QueryOrderCancel)object8).getOrderNo();
                                object10 = ((QueryOrderCancel)object8).getProductCode();
                                object9 = new Object[n4];
                                object9[0] = object11;
                                int n10 = 1;
                                object9[n10] = object10;
                                object11 = object6;
                                object6 = "new_cancel_order_details";
                                ((Ref$ObjectRef)object7).element = object12 = ((UrlHelper)object12).getApiUrl(string6, (String)object6, (Object[])object9);
                                object9 = new StringBuilder();
                                ((StringBuilder)object9).append(object12);
                                ((StringBuilder)object9).append(string5);
                                object12 = ((ux2_1)object3).d;
                                ((StringBuilder)object9).append((String)object12);
                                ((StringBuilder)object9).append(string4);
                                object12 = ((ux2_1)object3).e;
                                ((StringBuilder)object9).append((String)object12);
                                ((Ref$ObjectRef)object7).element = object12 = ((StringBuilder)object9).toString();
                                object9 = new HashMap();
                                object12 = ((QueryOrderCancel)object8).getCancelReason();
                                n8 = TextUtils.isEmpty((CharSequence)object12);
                                if (n8 == 0) break block27;
                                object12 = object11;
                                break block28;
                            }
                            object12 = ((QueryOrderCancel)object8).getCancelReason();
                        }
                        ((HashMap)object9).put(string3, object12);
                        object12 = ((QueryOrderCancel)object8).getCancelDescription();
                        n8 = TextUtils.isEmpty((CharSequence)object12);
                        if (n8 == 0) break block29;
                        object6 = object11;
                        break block30;
                    }
                    object6 = ((QueryOrderCancel)object8).getCancelDescription();
                }
                ((HashMap)object9).put(object5, object6);
                n8 = ((QueryOrderCancel)object8).getProductQuantity();
                object12 = n8;
                try {
                    ((HashMap)object9).put(string2, object12);
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    object8 = yn3_0.a;
                    ((yn3$a)object8).l((String)object4);
                    ((yn3$a)object8).e(unsupportedEncodingException);
                }
                object11 = object12;
                object10 = object7;
                Object object13 = object9;
                object12 = new xw2_2((ux2_1)object3, (Ref$ObjectRef)object7, string7, (HashMap)object9, null);
                object9 = new br2_2((Function2)object12);
                object12 = ir0_2.a;
                object12 = em0_2.b;
                object12 = ms0_1.m((es0_2)object9, (CoroutineContext)object12);
                object9 = new ww2_2((es0_2)object12);
                object12 = ir0_2.a;
                object12 = ms0_1.m((es0_2)object9, (CoroutineContext)object12);
                n7 = 0;
                object9 = new Za2$a((db2_1)objectArray, null);
                object3 = new at0_1((es0_2)object12, (gx0_2)object9);
                object12 = new Za2$b((db2_1)objectArray);
                za2_22.a = n3 = 1;
                object12 = ((at0_1)object3).collect((fs0_2)object12, za2_22);
                if (object12 == object2) {
                    return object2;
                }
            } else {
                int n14;
                Object[] objectArray2;
                Object object14;
                String string8;
                block34: {
                    block33: {
                        String string9;
                        block32: {
                            block31: {
                                string9 = object6;
                                object6 = objectArray.a;
                                string8 = ServiceUtil.getToken(objectArray.c());
                                object6.getClass();
                                Intrinsics.checkNotNullParameter(object8, (String)object7);
                                object7 = new Ref$ObjectRef();
                                object14 = UrlHelper.Companion.getInstance();
                                object3 = ((QueryOrderCancel)object8).getOrderNo();
                                String string10 = ((QueryOrderCancel)object8).getProductCode();
                                objectArray2 = object2;
                                object2 = new Object[n4];
                                object2[0] = object3;
                                n7 = 1;
                                object2[n7] = string10;
                                object3 = "new_cancel_order";
                                ((Ref$ObjectRef)object7).element = object14 = ((UrlHelper)object14).getApiUrl(string6, (String)object3, (Object[])object2);
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append(object14);
                                ((StringBuilder)object2).append(string5);
                                object14 = ((ux2_1)object6).d;
                                ((StringBuilder)object2).append((String)object14);
                                ((StringBuilder)object2).append(string4);
                                object14 = ((ux2_1)object6).e;
                                ((StringBuilder)object2).append((String)object14);
                                ((Ref$ObjectRef)object7).element = object14 = ((StringBuilder)object2).toString();
                                object2 = new HashMap();
                                object14 = ((QueryOrderCancel)object8).getCancelReason();
                                n14 = TextUtils.isEmpty((CharSequence)object14);
                                if (n14 == 0) break block31;
                                object14 = string9;
                                break block32;
                            }
                            object14 = ((QueryOrderCancel)object8).getCancelReason();
                        }
                        ((HashMap)object2).put(string3, object14);
                        object14 = ((QueryOrderCancel)object8).getCancelDescription();
                        n14 = TextUtils.isEmpty((CharSequence)object14);
                        if (n14 == 0) break block33;
                        object14 = string9;
                        break block34;
                    }
                    object14 = ((QueryOrderCancel)object8).getCancelDescription();
                }
                ((HashMap)object2).put(object5, object14);
                n14 = ((QueryOrderCancel)object8).getProductQuantity();
                object14 = n14;
                try {
                    ((HashMap)object2).put(string2, object14);
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    object3 = yn3_0.a;
                    ((yn3$a)object3).l((String)object4);
                    ((yn3$a)object3).e(unsupportedEncodingException);
                }
                string3 = null;
                object3 = object14;
                object8 = object6;
                object4 = object7;
                string2 = string8;
                object5 = object2;
                object6 = null;
                object14 = new vw2_2((ux2_1)object8, (Ref$ObjectRef)object7, string8, (HashMap)object2, null);
                object2 = new br2_2((Function2)object14);
                object14 = ir0_2.a;
                object14 = em0_2.b;
                object14 = ms0_1.m((es0_2)object2, (CoroutineContext)object14);
                object2 = new uw2_2((es0_2)object14);
                object14 = ir0_2.a;
                object14 = ms0_1.m((es0_2)object2, (CoroutineContext)object14);
                n7 = 0;
                object2 = new Za2$c((db2_1)objectArray, null);
                object3 = new at0_1((es0_2)object14, (gx0_2)object2);
                object14 = new Za2$d((db2_1)objectArray);
                za2_22.a = n4;
                object14 = ((at0_1)object3).collect((fs0_2)object14, za2_22);
                objectArray = objectArray2;
                if (object14 == objectArray2) {
                    return objectArray2;
                }
            }
        }
        return Unit.a;
    }
}

