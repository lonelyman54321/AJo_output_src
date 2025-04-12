/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryText;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/*
 * Renamed from zW2
 */
public final class zw2_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;
    public final /* synthetic */ QueryText c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public zw2_1(yw2_0 yw2_02, QueryText queryText, String string2, String string3, f80_0 f80_02) {
        this.b = yw2_02;
        this.c = queryText;
        this.d = string2;
        this.e = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        String string3 = this.e;
        yw2_0 yw2_02 = this.b;
        QueryText queryText = this.c;
        object = new zw2_1(yw2_02, queryText, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zw2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zw2_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        int n3;
        int n4;
        boolean bl2 = false;
        Object object2 = null;
        int n7 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n8 = this.a;
        if (n8 != 0) {
            if (n8 == n7) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        Object object3 = ((yw2_0)object).a;
        object3.getClass();
        Object object4 = this.c;
        Intrinsics.checkNotNullParameter(object4, "queryText");
        Intrinsics.checkNotNullParameter("search screen", "screenName");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object5 = UrlHelper.Companion.getInstance();
        CharSequence charSequence = ((QueryText)object4).getQueryText();
        Object object6 = new Object[n7];
        object6[0] = charSequence;
        charSequence = "plp";
        String string2 = "search_suggestions";
        ref$ObjectRef.element = object5 = ((UrlHelper)object5).getApiUrl((String)charSequence, string2, (Object[])object6);
        object5 = this.d;
        if (object5 != null && (n4 = ((String)object5).length()) != 0) {
            charSequence = (CharSequence)ref$ObjectRef.element;
            object6 = "&";
            bl2 = StringsKt.F(charSequence, (CharSequence)object6, false);
            if (bl2) {
                object2 = ref$ObjectRef.element;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(object2);
                ((StringBuilder)charSequence).append((String)object6);
                ((StringBuilder)charSequence).append((String)object5);
                object2 = ((StringBuilder)charSequence).toString();
            } else {
                object2 = ref$ObjectRef.element;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(object2);
                ((StringBuilder)charSequence).append("?");
                ((StringBuilder)charSequence).append((String)object5);
                object2 = ((StringBuilder)charSequence).toString();
            }
            ref$ObjectRef.element = object2;
        }
        object2 = new HashMap();
        object5 = ((QueryText)object4).getStoreId();
        if (object5 != null && (n3 = ((String)object5).length()) != 0) {
            cp_1.Companion.getClass();
            object5 = cp$a.e();
            charSequence = ((QueryText)object4).getStoreId();
            object6 = "getStoreId(...)";
            Intrinsics.checkNotNullExpressionValue(charSequence, (String)object6);
            object5.getClass();
            object5 = cp_1.z((String)charSequence);
            charSequence = "store";
            ((HashMap)object2).put(charSequence, object5);
        }
        if ((object5 = ((QueryText)object4).getBrandCode()) != null && (n3 = ((String)object5).length()) != 0) {
            object5 = od3_2.a;
            n4 = ((String)object5).length();
            if (n4 == 0) {
                object5 = od3_2.a();
            }
            if ((n4 = (int)(s20.a ? 1 : 0)) != 0 || (n4 = (int)(Intrinsics.areEqual(charSequence = od3_2.a(), string2 = ((ld3_2)((Object)(object6 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) != 0 || (n3 = (int)(Intrinsics.areEqual(object5, charSequence = ((ld3_2)((Object)object6)).getStoreId()) ? 1 : 0)) != 0) {
                object5 = "brandCode";
                object4 = ((QueryText)object4).getBrandCode();
                ((HashMap)object2).put(object5, object4);
            }
        }
        TU2.a(object2);
        object4 = z40_0.Companion;
        object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
        object5 = "autoSuggetionAPIFlag";
        boolean bl3 = ((ao0_0)object4).a((String)object5);
        object4 = String.valueOf(bl3);
        ((HashMap)object2).put(object5, object4);
        object4 = ((dw2_0)object3).c;
        object5 = ((UserInformation)object4).getUserSegementIds();
        if (object5 != null && (n3 = ((String)object5).length()) != 0) {
            object5 = "segmentIds";
            object4 = ((UserInformation)object4).getUserSegementIds();
            ((HashMap)object2).put(object5, object4);
        }
        n3 = 0;
        object5 = null;
        object4 = new aw2_2((dw2_0)object3, ref$ObjectRef, (HashMap)object2, null);
        object2 = new br2_2((Function2)object4);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new zv2_1((es0_2)object2);
        object2 = bg1_1.a;
        object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
        object3 = new zW2$a((yw2_0)object, null);
        object4 = new at0_1((es0_2)object2, (gx0_2)object3);
        object3 = this.e;
        object2 = new zW2$b((yw2_0)object, (String)object3);
        this.a = n7;
        object = ((at0_1)object4).collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

