/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eD
 */
public final class ed_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ String b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ dr0_0 f;

    public ed_2(Subcomponent subcomponent, String string2, p83_0 p83_02, int n3, int n4, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = subcomponent;
        this.b = string2;
        this.c = p83_02;
        this.d = n3;
        this.e = n4;
        this.f = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.e;
        dr0_0 dr0_02 = this.f;
        Subcomponent subcomponent = this.a;
        String string2 = this.b;
        p83_0 p83_02 = this.c;
        int n4 = this.d;
        object = new ed_2(subcomponent, string2, p83_02, n4, n3, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ed_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ed_2)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block10: {
            block8: {
                block9: {
                    var2_2 = j90_0.COROUTINE_SUSPENDED;
                    vl2_2.b(var1_1);
                    var3_3 = false;
                    var2_2 = null;
                    var1_1 = new wq0_0(0);
                    var4_4 = this.a;
                    var5_5 = null;
                    if (var4_4 != null) {
                        var6_6 = var4_4.getId();
                    } else {
                        var7_7 = 0;
                        var6_6 = null;
                    }
                    var1_1.a = var6_6;
                    var6_6 = new StringBuilder("fleek_post_");
                    var8_8 = this.b;
                    var6_6.append(var8_8);
                    var6_6 = var6_6.toString();
                    var1_1.b = var6_6;
                    if (var4_4 != null) {
                        var4_4 = var4_4.getPostContentType();
                    } else {
                        var9_9 = 0;
                        var4_4 = null;
                    }
                    if (var4_4 == null) ** GOTO lbl-1000
                    var7_7 = var4_4.hashCode();
                    if (var7_7 == (var10_10 = -1840606393)) break block8;
                    var10_10 = -205609049;
                    if (var7_7 == var10_10) break block9;
                    var10_10 = -169708227;
                    if (var7_7 != var10_10 || (var9_9 = var4_4.equals(var6_6 = "RESOURCE_ONLY")) == 0) ** GOTO lbl-1000
                    var4_4 = "product";
                    break block10;
                }
                var6_6 = "MEDIA_WITH_RESOURCES";
                var9_9 = var4_4.equals(var6_6);
                if (var9_9 == 0) ** GOTO lbl-1000
                var4_4 = "cont+product";
                break block10;
            }
            var6_6 = "MEDIA_ONLY";
            var9_9 = var4_4.equals(var6_6);
            if (var9_9 != 0) {
                var4_4 = "cont";
            } else lbl-1000:
            // 4 sources

            {
                var4_4 = "";
            }
        }
        var6_6 = this.c;
        var10_10 = this.d;
        if (var6_6 != null && (var11_11 = (Subcomponent)CollectionsKt.N(var10_10, (List)var6_6)) != null) {
            var2_2 = var11_11.isSeen();
            var11_11 = Boolean.TRUE;
            var3_3 = Intrinsics.areEqual(var2_2, var11_11);
        }
        var2_2 = var3_3 != false ? "seen" : "unseen";
        if (var6_6 != null && (var6_6 = (Subcomponent)CollectionsKt.N(var10_10, (List)var6_6)) != null && (var6_6 = var6_6.getMedia()) != null) {
            var5_5 = var6_6.getType();
        }
        var6_6 = " - ";
        var2_2 = KW.a((String)var2_2, (String)var6_6, (String)var4_4, (String)var6_6, var5_5);
        var1_1.c = var2_2;
        var2_2 = new StringBuilder();
        var2_2.append(var10_10);
        var2_2.append("|");
        var9_9 = this.e;
        var2_2.append(var9_9);
        var1_1.d = var2_2 = var2_2.toString();
        this.f.j((wq0_0)var1_1);
        return Unit.a;
    }
}

