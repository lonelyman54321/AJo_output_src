/*
 * Decompiled with CFR 0.152.
 */
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y50
 */
public abstract class y50_0 {
    public final tg_1 a;

    public y50_0() {
        this(null);
    }

    public y50_0(tg_1 tg_12) {
        Object object = new ArrayList();
        if (tg_12 != null) {
            tg_12 = tg_12.B();
        } else {
            object = new char[0];
            super((char[])object);
        }
        this.a = tg_12;
    }

    public final tg_1 a(oq1_1 object) {
        Object object2;
        tg_1 tg_12 = this.a;
        QG qG = tg_12.t((String)(object = ((oq1_1)object).a().toString()));
        boolean bl2 = qG instanceof tg_1;
        qG = bl2 ? (tg_1)qG : null;
        if (qG == null) {
            bl2 = false;
            object2 = new char[]{};
            qG = new pg_0((char[])object2);
            tg_12.z((String)object, qG);
        }
        if (bl2 = (qG = tg_12.q((String)object)) instanceof tg_1) {
            return (tg_1)qG;
        }
        object2 = new CLParsingException;
        object = Gn.a("no object found for key <", (String)object, ">, found [");
        String string2 = qG.i();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("] : ");
        ((StringBuilder)object).append(qG);
        object = ((StringBuilder)object).toString();
        object2((String)object, tg_12);
        throw object2;
    }

    public final void b(t50 object, Function1 function1) {
        tg_1 tg_12 = this.a((oq1_1)object);
        object = ((t50)object).b;
        r50 r502 = new r50(object, tg_12);
        function1.invoke(r502);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof y50_0;
        if (bl2) {
            object = ((y50_0)object).a;
            return Intrinsics.areEqual(this.a, object);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

