/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.pdprefresh.data.InstructionCategory;
import com.ril.ajio.pdprefresh.data.SizeInstructionConfig;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.text.b;

/*
 * Renamed from tj2
 */
public final class tj2_2 {
    public static final tj2$a_0 Companion;
    public static tj2_2 b;
    public static boolean c = true;
    public static boolean d = true;
    public static boolean e;
    public String a;

    static {
        tj2$a_0 tj2$a_0;
        Companion = tj2$a_0 = new Object();
    }

    public static InstructionCategory a(String string2, String string3) {
        boolean bl2;
        Object object;
        Iterator iterator = h40_0.a;
        iterator = z40_0.Companion;
        iterator = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)((Object)iterator)).a.b("size_instruction_config");
        if ((iterator = (SizeInstructionConfig)Z90.a(SizeInstructionConfig.class, (String)((Object)iterator))) != null) {
            object = ((SizeInstructionConfig)((Object)iterator)).getCategories();
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            iterator = ((SizeInstructionConfig)((Object)iterator)).getCategories().iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                object = (InstructionCategory)iterator.next();
                Object object2 = ((InstructionCategory)object).getBrickCategory();
                boolean bl4 = kotlin.text.b.i((String)object2, string3, bl3 = true);
                if (!bl4 || !(bl4 = CollectionsKt.F((Iterable)(object2 = (Iterable)((InstructionCategory)object).getBrickNames()), string2))) continue;
                return object;
            }
        }
        return null;
    }
}

