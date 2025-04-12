/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Fx0
 */
public final class fx0_1
extends Lambda
implements Function1 {
    public final /* synthetic */ mx0 c;
    public final /* synthetic */ Gx0 d;

    public fx0_1(mx0 mx02, Gx0 gx0) {
        this.c = mx02;
        this.d = gx0;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = this.c;
        object2 = object2 == (object = (mx0)object) ? " > " : "   ";
        object2 = Ex0.a((String)object2);
        Object object3 = this.d;
        object3.getClass();
        boolean bl2 = object instanceof bz_0;
        char c2 = ')';
        String string2 = ", newCursorPosition=";
        if (bl2) {
            object3 = new StringBuilder("CommitTextCommand(text.length=");
            object = (bz_0)object;
            String string3 = ((bz_0)object).a.a;
            int n3 = string3.length();
            ((StringBuilder)object3).append(n3);
            ((StringBuilder)object3).append(string2);
            int n4 = ((bz_0)object).b;
            object = tu.a((StringBuilder)object3, n4, c2);
        } else {
            bl2 = object instanceof M03;
            if (bl2) {
                object3 = new StringBuilder("SetComposingTextCommand(text.length=");
                object = (M03)object;
                String string4 = ((M03)object).a.a;
                int n7 = string4.length();
                ((StringBuilder)object3).append(n7);
                ((StringBuilder)object3).append(string2);
                int n8 = ((M03)object).b;
                object = tu.a((StringBuilder)object3, n8, c2);
            } else {
                bl2 = object instanceof L03;
                if (bl2) {
                    object = object.toString();
                } else {
                    bl2 = object instanceof jo0_0;
                    if (bl2) {
                        object = object.toString();
                    } else {
                        bl2 = object instanceof Ko0;
                        if (bl2) {
                            object = object.toString();
                        } else {
                            bl2 = object instanceof N03;
                            if (bl2) {
                                object = object.toString();
                            } else {
                                bl2 = object instanceof tn0_1;
                                if (bl2) {
                                    ((tn0_1)object).getClass();
                                    object = "FinishComposingTextCommand()";
                                } else {
                                    bl2 = object instanceof go0_0;
                                    if (bl2) {
                                        ((go0_0)object).getClass();
                                        object = "DeleteAllCommand()";
                                    } else {
                                        if ((object = Reflection.getOrCreateKotlinClass(object.getClass()).getSimpleName()) == null) {
                                            object = "{anonymous EditCommand}";
                                        }
                                        object3 = "Unknown EditCommand: ";
                                        object = ((String)object3).concat((String)object);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ((StringBuilder)object2).append((String)object);
        return ((StringBuilder)object2).toString();
    }
}

