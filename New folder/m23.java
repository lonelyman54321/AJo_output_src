/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class m23 {
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final Function1 c;

    public m23(SharedPreferences sharedPreferences2, SharedPreferences sharedPreferences3, pj0_1 pj0_12) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "oldSharedPreferences");
        Intrinsics.checkNotNullParameter(sharedPreferences3, "newSharedPreferences");
        Intrinsics.checkNotNullParameter(String.class, "valueType");
        Intrinsics.checkNotNullParameter(pj0_12, "condition");
        this.a = sharedPreferences2;
        this.b = sharedPreferences3;
        this.c = pj0_12;
    }

    public final void a() {
        int n3;
        SharedPreferences sharedPreferences2 = this.a;
        Object object = sharedPreferences2.getAll();
        SharedPreferences.Editor editor = this.b.edit();
        Object object2 = "oldData";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = object.entrySet().iterator();
        while ((n3 = object.hasNext()) != 0) {
            float f5;
            long l2;
            Class clazz;
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            Class<String> clazz2 = String.class;
            boolean bl2 = clazz2.isInstance(object2 = object2.getValue());
            if (!bl2 || !(bl2 = ((Boolean)((Object)(clazz = (Boolean)this.c.invoke(object2)))).booleanValue())) continue;
            clazz = Boolean.class;
            bl2 = Intrinsics.areEqual(clazz2, clazz);
            if (bl2) {
                clazz2 = "null cannot be cast to non-null type kotlin.Boolean";
                Intrinsics.checkNotNull(object2, (String)((Object)clazz2));
                object2 = (Boolean)object2;
                n3 = ((Boolean)object2).booleanValue();
                editor.putBoolean(string2, n3 != 0);
                continue;
            }
            clazz = Integer.class;
            bl2 = Intrinsics.areEqual(clazz2, clazz);
            if (bl2) {
                clazz2 = "null cannot be cast to non-null type kotlin.Int";
                Intrinsics.checkNotNull(object2, (String)((Object)clazz2));
                object2 = (Integer)object2;
                n3 = (Integer)object2;
                editor.putInt(string2, n3);
                continue;
            }
            clazz = Long.class;
            bl2 = Intrinsics.areEqual(clazz2, clazz);
            if (bl2) {
                clazz2 = "null cannot be cast to non-null type kotlin.Long";
                Intrinsics.checkNotNull(object2, (String)((Object)clazz2));
                object2 = (Long)object2;
                l2 = (Long)object2;
                editor.putLong(string2, l2);
                continue;
            }
            clazz = Float.class;
            bl2 = Intrinsics.areEqual(clazz2, clazz);
            if (bl2) {
                clazz2 = "null cannot be cast to non-null type kotlin.Float";
                Intrinsics.checkNotNull(object2, (String)((Object)clazz2));
                object2 = (Float)object2;
                f5 = ((Float)object2).floatValue();
                editor.putFloat(string2, f5);
                continue;
            }
            boolean bl3 = Intrinsics.areEqual(clazz2, clazz2);
            if (bl3) {
                clazz2 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object2, (String)((Object)clazz2));
                object2 = (String)object2;
                editor.putString(string2, (String)object2);
                continue;
            }
            bl3 = object2 instanceof Boolean;
            if (bl3) {
                object2 = (Boolean)object2;
                n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                editor.putBoolean(string2, n3 != 0);
                continue;
            }
            bl3 = object2 instanceof Integer;
            if (bl3) {
                object2 = (Number)object2;
                n3 = ((Number)object2).intValue();
                editor.putInt(string2, n3);
                continue;
            }
            bl3 = object2 instanceof Long;
            if (bl3) {
                object2 = (Number)object2;
                l2 = ((Number)object2).longValue();
                editor.putLong(string2, l2);
                continue;
            }
            bl3 = object2 instanceof Float;
            if (bl3) {
                object2 = (Number)object2;
                f5 = ((Number)object2).floatValue();
                editor.putFloat(string2, f5);
                continue;
            }
            bl3 = object2 instanceof String;
            if (!bl3) continue;
            object2 = (String)object2;
            editor.putString(string2, (String)object2);
        }
        gc3_0.i(editor);
        sharedPreferences2.edit().clear().apply();
    }
}

