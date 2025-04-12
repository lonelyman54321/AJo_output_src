/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from Tv
 */
public abstract class tv_0
implements fk_0 {
    public final /* synthetic */ int a;
    public Object b;

    public tv_0() {
        this.a = 1;
    }

    public tv_0(List list) {
        this.a = 0;
        this.b = list;
    }

    public List b() {
        return (List)this.b;
    }

    public boolean c() {
        boolean bl2;
        Object object = (List)this.b;
        int n3 = object.isEmpty();
        int n4 = 1;
        if (!(n3 != 0 || (n3 = object.size()) == n4 && (bl2 = ((Bo1)(object = (Bo1)object.get(0))).c()))) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public String toString() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return super.toString();
            }
            case 0: 
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object object = (List)this.b;
        boolean bl2 = object.isEmpty();
        if (!bl2) {
            String string2 = "values=";
            stringBuilder.append(string2);
            object = Arrays.toString(object.toArray());
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }
}

