/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/*
 * Renamed from T11
 */
public final class t11_0
extends x80$a {
    public final Gson a;

    public t11_0(Gson gson) {
        this.a = gson;
    }

    public final x80_0 a(Type object) {
        object = TypeToken.get((Type)object);
        Gson gson = this.a;
        object = gson.getAdapter((TypeToken)object);
        u11_0 u11_02 = new u11_0(gson, (TypeAdapter)object);
        return u11_02;
    }

    public final x80_0 b(Type object, Annotation[] object2, dm2_1 object3) {
        object = TypeToken.get((Type)object);
        object2 = this.a;
        object = ((Gson)object2).getAdapter((TypeToken)object);
        object3 = new v11_0((Gson)object2, (TypeAdapter)object);
        return object3;
    }
}

