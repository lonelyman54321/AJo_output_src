/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from bQ2
 */
public final class bq2_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Map c;
    public final /* synthetic */ XP2 d;

    public bq2_0(Map map2, XP2 xP2) {
        this.c = map2;
        this.d = xP2;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        block8: {
            block7: {
                int n3;
                XP2 xP2;
                block6: {
                    boolean bl2;
                    object = (Number)object;
                    int c3 = ((Number)object).intValue();
                    object2 = (String)object2;
                    object3 = (cU1)object3;
                    Intrinsics.checkNotNullParameter(object2, "argName");
                    Intrinsics.checkNotNullParameter(object3, "navType");
                    object4 = this.c.get(object2);
                    Intrinsics.checkNotNull(object4);
                    object4 = (List)object4;
                    xP2 = this.d;
                    xP2.getClass();
                    Intrinsics.checkNotNullParameter(object2, "name");
                    Intrinsics.checkNotNullParameter(object3, "type");
                    CharSequence charSequence = "value";
                    Intrinsics.checkNotNullParameter(object4, (String)charSequence);
                    n3 = object3 instanceof vx_1;
                    object = n3 == 0 && !(bl2 = (object3 = xP2.a.getDescriptor()).i(c3)) ? XP2$a.PATH : XP2$a.QUERY;
                    object3 = XP2$b.$EnumSwitchMapping$0;
                    int n4 = ((Enum)object).ordinal();
                    Object object5 = object3[n4];
                    n3 = 1;
                    if (object5 == n3) break block6;
                    n3 = 2;
                    if (object5 == n3) {
                        object4 = (Iterable)object4;
                        object = object4.iterator();
                        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            object3 = (String)object.next();
                            object4 = xP2.d;
                            int n7 = ((String)object4).length();
                            object4 = n7 == 0 ? "?" : "&";
                            charSequence = new StringBuilder();
                            String string2 = xP2.d;
                            ((StringBuilder)charSequence).append(string2);
                            ((StringBuilder)charSequence).append((String)object4);
                            ((StringBuilder)charSequence).append((String)object2);
                            n7 = 61;
                            ((StringBuilder)charSequence).append((char)n7);
                            ((StringBuilder)charSequence).append((String)object3);
                            xP2.d = object3 = ((StringBuilder)charSequence).toString();
                        }
                    }
                    break block7;
                }
                int n8 = object4.size();
                if (n8 != n3) break block8;
                object = (String)CollectionsKt.L((List)object4);
                object2 = new StringBuilder();
                object3 = xP2.c;
                ((StringBuilder)object2).append((String)object3);
                n3 = 47;
                ((StringBuilder)object2).append((char)n3);
                ((StringBuilder)object2).append((String)object);
                xP2.c = object = ((StringBuilder)object2).toString();
            }
            return Unit.a;
        }
        object = Gn.a("Expected one value for argument ", (String)object2, ", found ");
        int n10 = object4.size();
        ((StringBuilder)object).append(n10);
        ((StringBuilder)object).append("values instead.");
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

