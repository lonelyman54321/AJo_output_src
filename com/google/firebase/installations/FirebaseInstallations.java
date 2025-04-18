/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.firebase.installations;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.CrossProcessLock;
import com.google.firebase.installations.FirebaseInstallations$1;
import com.google.firebase.installations.FirebaseInstallations$2;
import com.google.firebase.installations.FirebaseInstallations$3;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.FirebaseInstallationsException$Status;
import com.google.firebase.installations.GetAuthTokenListener;
import com.google.firebase.installations.GetIdListener;
import com.google.firebase.installations.RandomFidGenerator;
import com.google.firebase.installations.StateListener;
import com.google.firebase.installations.Utils;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class FirebaseInstallations
implements FirebaseInstallationsApi {
    private static final String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private static final String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30L;
    private static final String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final ThreadFactory THREAD_FACTORY;
    private static final Object lockGenerateFid;
    private final ExecutorService backgroundExecutor;
    private String cachedFid;
    private final RandomFidGenerator fidGenerator;
    private Set fidListeners;
    private final FirebaseApp firebaseApp;
    private final Lazy iidStore;
    private final List listeners;
    private final Object lock;
    private final Executor networkExecutor;
    private final PersistedInstallation persistedInstallation;
    private final FirebaseInstallationServiceClient serviceClient;
    private final Utils utils;

    static {
        Object object;
        lockGenerateFid = object = new Object();
        THREAD_FACTORY = object = new FirebaseInstallations$1();
    }

    public FirebaseInstallations(FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, Executor executor) {
        Object object = firebaseApp.getApplicationContext();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient((Context)object, provider);
        PersistedInstallation persistedInstallation = new PersistedInstallation(firebaseApp);
        Utils utils = Utils.getInstance();
        super(firebaseApp);
        Lazy lazy = new Lazy(provider);
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        object = this;
        this(executorService, executor, firebaseApp, firebaseInstallationServiceClient, persistedInstallation, utils, lazy, randomFidGenerator);
    }

    public FirebaseInstallations(ExecutorService executorService, Executor executor, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, Lazy lazy, RandomFidGenerator randomFidGenerator) {
        AbstractCollection abstractCollection = new AbstractCollection();
        this.lock = abstractCollection;
        this.fidListeners = abstractCollection = new AbstractCollection();
        this.listeners = abstractCollection;
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = persistedInstallation;
        this.utils = utils;
        this.iidStore = lazy;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = executor;
    }

    public static /* synthetic */ Void a(FirebaseInstallations firebaseInstallations) {
        return firebaseInstallations.deleteFirebaseInstallationId();
    }

    public static /* synthetic */ Set access$000(FirebaseInstallations firebaseInstallations) {
        return firebaseInstallations.fidListeners;
    }

    private Task addGetAuthTokenListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Utils utils = this.utils;
        GetAuthTokenListener getAuthTokenListener = new GetAuthTokenListener(utils, taskCompletionSource);
        this.addStateListeners(getAuthTokenListener);
        return taskCompletionSource.getTask();
    }

    private Task addGetIdListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetIdListener getIdListener = new GetIdListener(taskCompletionSource);
        this.addStateListeners(getIdListener);
        return taskCompletionSource.getTask();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addStateListeners(StateListener stateListener) {
        Object object = this.lock;
        synchronized (object) {
            List list = this.listeners;
            list.add(stateListener);
            return;
        }
    }

    public static /* synthetic */ void b(FirebaseInstallations firebaseInstallations, boolean bl2) {
        firebaseInstallations.lambda$getToken$2(bl2);
    }

    public static /* synthetic */ void c(FirebaseInstallations firebaseInstallations, boolean bl2) {
        firebaseInstallations.lambda$doRegistrationOrRefresh$3(bl2);
    }

    public static /* synthetic */ void d(FirebaseInstallations firebaseInstallations) {
        firebaseInstallations.lambda$getId$1();
    }

    private Void deleteFirebaseInstallationId() {
        this.updateCacheFid(null);
        PersistedInstallationEntry persistedInstallationEntry = this.getMultiProcessSafePrefs();
        boolean bl2 = persistedInstallationEntry.isRegistered();
        if (bl2) {
            FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.serviceClient;
            String string2 = this.getApiKey();
            String string3 = persistedInstallationEntry.getFirebaseInstallationId();
            String string4 = this.getProjectIdentifier();
            String string5 = persistedInstallationEntry.getRefreshToken();
            firebaseInstallationServiceClient.deleteFirebaseInstallation(string2, string3, string4, string5);
        }
        persistedInstallationEntry = persistedInstallationEntry.withNoGeneratedFid();
        this.insertOrUpdatePrefs(persistedInstallationEntry);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void doNetworkCallIfNecessary(boolean bl2) {
        FirebaseInstallationsException firebaseInstallationsException2;
        block7: {
            Object object;
            Object object2;
            block8: {
                block5: {
                    block6: {
                        object2 = this.getMultiProcessSafePrefs();
                        try {
                            boolean bl3 = ((PersistedInstallationEntry)object2).isErrored();
                            if (bl3 || (bl3 = ((PersistedInstallationEntry)object2).isUnregistered())) break block5;
                            if (bl2) break block6;
                            object = this.utils;
                            bl2 = ((Utils)object).isAuthTokenExpired((PersistedInstallationEntry)object2);
                            if (!bl2) return;
                        }
                        catch (FirebaseInstallationsException firebaseInstallationsException2) {
                            break block7;
                        }
                    }
                    object = this.fetchAuthTokenFromServer((PersistedInstallationEntry)object2);
                    break block8;
                }
                object = this.registerFidWithServer((PersistedInstallationEntry)object2);
            }
            this.insertOrUpdatePrefs((PersistedInstallationEntry)object);
            this.updateFidListener((PersistedInstallationEntry)object2, (PersistedInstallationEntry)object);
            boolean bl4 = ((PersistedInstallationEntry)object).isRegistered();
            if (bl4) {
                object2 = ((PersistedInstallationEntry)object).getFirebaseInstallationId();
                this.updateCacheFid((String)object2);
            }
            if (bl4 = ((PersistedInstallationEntry)object).isErrored()) {
                object2 = FirebaseInstallationsException$Status.BAD_CONFIG;
                object = new FirebaseInstallationsException((FirebaseInstallationsException$Status)((Object)object2));
                this.triggerOnException((Exception)object);
                return;
            }
            bl4 = ((PersistedInstallationEntry)object).isNotGenerated();
            if (bl4) {
                object2 = AUTH_ERROR_MSG;
                object = new IOException((String)object2);
                this.triggerOnException((Exception)object);
                return;
            }
            this.triggerOnStateReached((PersistedInstallationEntry)object);
            return;
        }
        this.triggerOnException(firebaseInstallationsException2);
    }

    private final void doRegistrationOrRefresh(boolean bl2) {
        Object object = this.getPrefsWithGeneratedIdMultiProcessSafe();
        if (bl2) {
            object = ((PersistedInstallationEntry)object).withClearedAuthToken();
        }
        this.triggerOnStateReached((PersistedInstallationEntry)object);
        object = this.networkExecutor;
        fn0_1 fn0_12 = new fn0_1(this, bl2);
        object.execute(fn0_12);
    }

    public static /* synthetic */ IidStore e(FirebaseApp firebaseApp) {
        return iidStore = new IidStore(firebaseApp);
    }

    private PersistedInstallationEntry fetchAuthTokenFromServer(PersistedInstallationEntry object) {
        Object object2 = this.serviceClient;
        Object object3 = this.getApiKey();
        Object object4 = ((PersistedInstallationEntry)object).getFirebaseInstallationId();
        String string2 = this.getProjectIdentifier();
        String string3 = ((PersistedInstallationEntry)object).getRefreshToken();
        object2 = ((FirebaseInstallationServiceClient)object2).generateAuthToken((String)object3, (String)object4, string2, string3);
        object3 = FirebaseInstallations$3.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;
        object4 = ((TokenResult)object2).getResponseCode();
        int n3 = ((Enum)object4).ordinal();
        Object object5 = object3[n3];
        if (object5 != (n3 = 1)) {
            int n4 = 2;
            if (object5 != n4) {
                n4 = 3;
                if (object5 == n4) {
                    this.updateCacheFid(null);
                    return ((PersistedInstallationEntry)object).withNoGeneratedFid();
                }
                object3 = FirebaseInstallationsException$Status.UNAVAILABLE;
                object = new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", (FirebaseInstallationsException$Status)((Object)object3));
                throw object;
            }
            return ((PersistedInstallationEntry)object).withFisError("BAD CONFIG");
        }
        object3 = ((TokenResult)object2).getToken();
        long l2 = ((TokenResult)object2).getTokenExpirationTimestamp();
        long l3 = this.utils.currentTimeInSecs();
        object2 = object;
        return ((PersistedInstallationEntry)object).withAuthToken((String)object3, l2, l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String getCacheFid() {
        synchronized (this) {
            return this.cachedFid;
        }
    }

    private IidStore getIidStore() {
        return (IidStore)this.iidStore.get();
    }

    public static FirebaseInstallations getInstance() {
        return FirebaseInstallations.getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstallations getInstance(FirebaseApp firebaseApp) {
        boolean bl2 = firebaseApp != null;
        Preconditions.checkArgument(bl2, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations)firebaseApp.get(FirebaseInstallationsApi.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private PersistedInstallationEntry getMultiProcessSafePrefs() {
        Object object = lockGenerateFid;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                Object object2;
                block7: {
                    Object object3;
                    try {
                        object3 = this.firebaseApp;
                        object3 = ((FirebaseApp)object3).getApplicationContext();
                        object2 = LOCKFILE_NAME_GENERATE_FID;
                        object3 = CrossProcessLock.acquire((Context)object3, (String)object2);
                    }
                    catch (Throwable throwable2) {}
                    try {
                        object2 = this.persistedInstallation;
                        object2 = ((PersistedInstallation)object2).readPersistedInstallationEntryValue();
                        if (object3 == null) break block7;
                    }
                    catch (Throwable throwable3) {
                        if (object3 != null) {
                            ((CrossProcessLock)object3).releaseAndClose();
                        }
                        throw throwable3;
                    }
                    ((CrossProcessLock)object3).releaseAndClose();
                    break block8;
                }
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        Object object = lockGenerateFid;
        synchronized (object) {
            Throwable throwable3;
            block8: {
                Throwable throwable22;
                Object object2;
                block10: {
                    Object object3;
                    block9: {
                        try {
                            object2 = this.firebaseApp;
                            object2 = ((FirebaseApp)object2).getApplicationContext();
                            object3 = LOCKFILE_NAME_GENERATE_FID;
                            object2 = CrossProcessLock.acquire((Context)object2, (String)object3);
                        }
                        catch (Throwable throwable3) {
                            break block8;
                        }
                        try {
                            object3 = this.persistedInstallation;
                            object3 = ((PersistedInstallation)object3).readPersistedInstallationEntryValue();
                            boolean bl2 = ((PersistedInstallationEntry)object3).isNotGenerated();
                            if (!bl2) break block9;
                            String string2 = this.readExistingIidOrCreateFid((PersistedInstallationEntry)object3);
                            PersistedInstallation persistedInstallation = this.persistedInstallation;
                            object3 = ((PersistedInstallationEntry)object3).withUnregisteredFid(string2);
                            object3 = persistedInstallation.insertOrUpdatePersistedInstallationEntry((PersistedInstallationEntry)object3);
                        }
                        catch (Throwable throwable22) {
                            break block10;
                        }
                    }
                    if (object2 != null) {
                        ((CrossProcessLock)object2).releaseAndClose();
                    }
                    return object3;
                }
                if (object2 != null) {
                    ((CrossProcessLock)object2).releaseAndClose();
                }
                throw throwable22;
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry) {
        Object object = lockGenerateFid;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                block7: {
                    Object object2;
                    Object object3;
                    try {
                        object3 = this.firebaseApp;
                        object3 = ((FirebaseApp)object3).getApplicationContext();
                        object2 = LOCKFILE_NAME_GENERATE_FID;
                        object3 = CrossProcessLock.acquire((Context)object3, (String)object2);
                    }
                    catch (Throwable throwable2) {}
                    try {
                        object2 = this.persistedInstallation;
                        ((PersistedInstallation)object2).insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
                        if (object3 == null) break block7;
                    }
                    catch (Throwable throwable3) {
                        if (object3 != null) {
                            ((CrossProcessLock)object3).releaseAndClose();
                        }
                        throw throwable3;
                    }
                    ((CrossProcessLock)object3).releaseAndClose();
                    break block8;
                }
                return;
            }
            throw throwable2;
        }
    }

    private /* synthetic */ void lambda$doRegistrationOrRefresh$3(boolean bl2) {
        this.doNetworkCallIfNecessary(bl2);
    }

    private /* synthetic */ void lambda$getId$1() {
        this.doRegistrationOrRefresh(false);
    }

    private /* synthetic */ void lambda$getToken$2(boolean bl2) {
        this.doRegistrationOrRefresh(bl2);
    }

    private void preConditionChecks() {
        String string2 = this.getApplicationId();
        String string3 = APP_ID_VALIDATION_MSG;
        Preconditions.checkNotEmpty(string2, string3);
        Preconditions.checkNotEmpty(this.getProjectIdentifier(), PROJECT_ID_VALIDATION_MSG);
        string2 = this.getApiKey();
        String string4 = API_KEY_VALIDATION_MSG;
        Preconditions.checkNotEmpty(string2, string4);
        Preconditions.checkArgument(Utils.isValidAppIdFormat(this.getApplicationId()), string3);
        Preconditions.checkArgument(Utils.isValidApiKeyFormat(this.getApiKey()), string4);
    }

    private String readExistingIidOrCreateFid(PersistedInstallationEntry object) {
        boolean bl2;
        String string2;
        Object object2 = this.firebaseApp.getName();
        boolean bl3 = ((String)object2).equals(string2 = CHIME_FIREBASE_APP_NAME);
        if (!bl3 && !(bl3 = ((FirebaseApp)(object2 = this.firebaseApp)).isDefaultApp()) || !(bl2 = ((PersistedInstallationEntry)object).shouldAttemptMigration())) {
            return this.fidGenerator.createRandomFid();
        }
        object = this.getIidStore().readIid();
        bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            object = this.fidGenerator.createRandomFid();
        }
        return object;
    }

    private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry object) {
        Object object2;
        int n3;
        Object object3 = ((PersistedInstallationEntry)object).getFirebaseInstallationId();
        if (object3 != null && (n3 = ((String)(object3 = ((PersistedInstallationEntry)object).getFirebaseInstallationId())).length()) == (object2 = 11)) {
            object3 = this.getIidStore().readToken();
        } else {
            n3 = 0;
            object3 = null;
        }
        Object object4 = this.serviceClient;
        Object object5 = this.getApiKey();
        String string2 = ((PersistedInstallationEntry)object).getFirebaseInstallationId();
        String string3 = this.getProjectIdentifier();
        String string4 = this.getApplicationId();
        object3 = ((FirebaseInstallationServiceClient)object4).createFirebaseInstallation((String)object5, string2, string3, string4, (String)object3);
        object4 = FirebaseInstallations$3.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
        object5 = ((InstallationResponse)object3).getResponseCode();
        int n4 = ((Enum)object5).ordinal();
        object2 = object4[n4];
        n4 = 1;
        if (object2 != n4) {
            n3 = 2;
            if (object2 == n3) {
                return ((PersistedInstallationEntry)object).withFisError("BAD CONFIG");
            }
            object4 = FirebaseInstallationsException$Status.UNAVAILABLE;
            object = new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", (FirebaseInstallationsException$Status)((Object)object4));
            throw object;
        }
        string2 = ((InstallationResponse)object3).getFid();
        string3 = ((InstallationResponse)object3).getRefreshToken();
        long l2 = this.utils.currentTimeInSecs();
        String string5 = ((InstallationResponse)object3).getAuthToken().getToken();
        long l3 = ((InstallationResponse)object3).getAuthToken().getTokenExpirationTimestamp();
        object5 = object;
        return ((PersistedInstallationEntry)object).withRegisteredFid(string2, string3, l2, string5, l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void triggerOnException(Exception exception) {
        Object object = this.lock;
        synchronized (object) {
            try {
                Object object2 = this.listeners;
                object2 = object2.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        return;
                    }
                    Object object3 = object2.next();
                    bl2 = (object3 = (StateListener)object3).onException(exception);
                    if (!bl2) continue;
                    object2.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        Object object = this.lock;
        synchronized (object) {
            try {
                Object object2 = this.listeners;
                object2 = object2.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        return;
                    }
                    Object object3 = object2.next();
                    bl2 = (object3 = (StateListener)object3).onStateReached(persistedInstallationEntry);
                    if (!bl2) continue;
                    object2.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateCacheFid(String string2) {
        synchronized (this) {
            this.cachedFid = string2;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateFidListener(PersistedInstallationEntry iterator, PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl2;
                        Object object = this.fidListeners;
                        int n3 = object.size();
                        if (n3 == 0 || (bl2 = TextUtils.equals((CharSequence)((Object)(iterator = ((PersistedInstallationEntry)((Object)iterator)).getFirebaseInstallationId())), (CharSequence)(object = persistedInstallationEntry.getFirebaseInstallationId())))) break block5;
                        iterator = this.fidListeners;
                        iterator = iterator.iterator();
                        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                            object = iterator.next();
                            object = (FidListener)object;
                            String string2 = persistedInstallationEntry.getFirebaseInstallationId();
                            object.onFidChanged(string2);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public Task delete() {
        ExecutorService executorService = this.backgroundExecutor;
        gn0_1 gn0_12 = new gn0_1(this);
        return Tasks.call(executorService, gn0_12);
    }

    public String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    public String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    public Task getId() {
        this.preConditionChecks();
        Object object = this.getCacheFid();
        if (object != null) {
            return Tasks.forResult(object);
        }
        object = this.addGetIdListener();
        ExecutorService executorService = this.backgroundExecutor;
        gB gB2 = new gB(this, 1);
        executorService.execute(gB2);
        return object;
    }

    public String getName() {
        return this.firebaseApp.getName();
    }

    public String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    public Task getToken(boolean bl2) {
        this.preConditionChecks();
        Task task2 = this.addGetAuthTokenListener();
        ExecutorService executorService = this.backgroundExecutor;
        hn0_1 hn0_12 = new hn0_1(this, bl2);
        executorService.execute(hn0_12);
        return task2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FidListenerHandle registerFidListener(FidListener fidListener) {
        synchronized (this) {
            Set set = this.fidListeners;
            set.add(fidListener);
            return new FirebaseInstallations$2(this, fidListener);
        }
    }
}

