/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.payment.utils.InternalWalletUtil$enabledInternalWalletList$2$walletListType$1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from oB0
 */
public final class ob0_2
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ob0_2(int n3) {
        this.a = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                HashSet<Object> hashSet = new HashSet<Object>();
                Iterator iterator = z40_0.Companion;
                iterator = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)((Object)iterator)).a;
                Object object = "enabled_internal_wallets";
                iterator = ((ao0_0)((Object)iterator)).b((String)object);
                object = new InternalWalletUtil$enabledInternalWalletList$2$walletListType$1();
                object = ((TypeToken)object).getType();
                Gson gson = new Gson();
                iterator = gson.fromJson((String)((Object)iterator), (Type)object);
                iterator = (ArrayList)((Object)iterator);
                if (iterator == null) return hashSet;
                try {
                    iterator = iterator.iterator();
                }
                catch (Exception exception) {
                    object = yn3_0.a;
                    ((yn3$a)object).e(exception);
                }
                while (true) {
                    boolean bl2 = iterator.hasNext();
                    if (!bl2) return hashSet;
                    object = iterator.next();
                    if ((object = (String)object) == null) continue;
                    int n4 = ((String)object).length();
                    if (n4 == 0) continue;
                    hashSet.add(object);
                    continue;
                    break;
                }
                return hashSet;
            }
            case 0: 
        }
        return Unit.a;
    }
}

