/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/*
 * Renamed from cR2
 */
public final class cr2_2
extends kj$a_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final kj_2 a(Type var1_1, Annotation[] var2_2) {
        var2_2 /* !! */  = cz3_0.e((Type)var1_1);
        if (var2_2 /* !! */  == (var3_3 = u00_0.class)) {
            var1_1 = new br2_1((Type)Void.class, false, true, false, false, false, true);
            return var1_1;
        }
        var3_3 = yt0_2.class;
        var4_4 = var2_2 /* !! */  == var3_3;
        var3_3 = g53_0.class;
        var5_5 = var2_2 /* !! */  == var3_3;
        var3_3 = uk1_1.class;
        var6_6 = var2_2 /* !! */  == var3_3;
        var3_3 = t62_0.class;
        if (!(var2_2 /* !! */  == var3_3 || var4_4 || var5_5 || var6_6)) {
            return null;
        }
        var7_7 = var1_1 instanceof ParameterizedType;
        if (!var7_7) {
            var1_1 = !var4_4 ? (!var5_5 ? (var6_6 ? "Maybe" : "Observable") : "Single") : "Flowable";
            var3_3 = new StringBuilder();
            var3_3.append((String)var1_1);
            var3_3.append(" return type must be parameterized as ");
            var3_3.append((String)var1_1);
            var3_3.append("<Foo> or ");
            var3_3.append((String)var1_1);
            var3_3.append("<? extends Foo>");
            var1_1 = var3_3.toString();
            var2_2 /* !! */  = new IllegalStateException((String)var1_1);
            throw var2_2 /* !! */ ;
        }
        var1_1 = (ParameterizedType)var1_1;
        var2_2 /* !! */  = cz3_0.e((Type)(var1_1 = cz3_0.d(0, (ParameterizedType)var1_1)));
        if (var2_2 /* !! */  != (var3_3 = dl2_2.class)) ** GOTO lbl46
        var7_7 = var1_1 instanceof ParameterizedType;
        if (var7_7) {
            var1_1 = (ParameterizedType)var1_1;
            var8_8 = var1_1 = cz3_0.d(0, (ParameterizedType)var1_1);
            var9_9 = false;
lbl41:
            // 2 sources

            while (true) {
                var10_10 = false;
                break;
            }
        } else {
            var1_1 = new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            throw var1_1;
lbl46:
            // 1 sources

            var3_3 = ul2_2.class;
            if (var2_2 /* !! */  == var3_3) {
                var7_7 = var1_1 instanceof ParameterizedType;
                if (var7_7) {
                    var1_1 = (ParameterizedType)var1_1;
                    var8_8 = var1_1 = cz3_0.d(0, (ParameterizedType)var1_1);
                    var9_9 = true;
                    ** continue;
                }
                var1_1 = new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                throw var1_1;
            }
            var8_8 = var1_1;
            var9_9 = false;
            var10_10 = true;
        }
        var1_1 = new br2_1((Type)var8_8, var9_9, var10_10, var4_4, var5_5, var6_6, false);
        return var1_1;
    }
}

