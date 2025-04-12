/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder$1;
import com.google.common.cache.CacheBuilder$2;
import com.google.common.cache.CacheBuilder$3;
import com.google.common.cache.CacheBuilder$LoggerHolder;
import com.google.common.cache.CacheBuilder$NullListener;
import com.google.common.cache.CacheBuilder$OneWeigher;
import com.google.common.cache.CacheBuilderSpec;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.LocalCache$LocalLoadingCache;
import com.google.common.cache.LocalCache$LocalManualCache;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.Weigher;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class CacheBuilder {
    static final Supplier CACHE_STATS_COUNTER;
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int DEFAULT_REFRESH_NANOS = 0;
    static final CacheStats EMPTY_STATS;
    static final Supplier NULL_STATS_COUNTER;
    static final Ticker NULL_TICKER;
    static final int UNSET_INT = 255;
    int concurrencyLevel;
    long expireAfterAccessNanos;
    long expireAfterWriteNanos;
    int initialCapacity;
    Equivalence keyEquivalence;
    LocalCache$Strength keyStrength;
    long maximumSize;
    long maximumWeight;
    long refreshNanos;
    RemovalListener removalListener;
    Supplier statsCounterSupplier;
    boolean strictParsing = true;
    Ticker ticker;
    Equivalence valueEquivalence;
    LocalCache$Strength valueStrength;
    Weigher weigher;

    static {
        Object object = new CacheBuilder$1();
        NULL_STATS_COUNTER = Suppliers.ofInstance(object);
        EMPTY_STATS = object = new CacheStats(0L, 0L, 0L, 0L, 0L, 0L);
        CACHE_STATS_COUNTER = object = new CacheBuilder$2();
        NULL_TICKER = object = new CacheBuilder$3();
    }

    private CacheBuilder() {
        Supplier supplier;
        long l2;
        int n3;
        this.initialCapacity = n3 = -1;
        this.concurrencyLevel = n3;
        this.maximumSize = l2 = (long)-1;
        this.maximumWeight = l2;
        this.expireAfterWriteNanos = l2;
        this.expireAfterAccessNanos = l2;
        this.refreshNanos = l2;
        this.statsCounterSupplier = supplier = NULL_STATS_COUNTER;
    }

    private void checkNonLoadingCache() {
        long l2 = this.refreshNanos;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkState(bl2, "refreshAfterWrite requires a LoadingCache");
    }

    private void checkWeightWithWeigher() {
        Object object = this.weigher;
        boolean bl2 = false;
        Level level = null;
        Object object2 = true;
        long l2 = -1;
        if (object == null) {
            long l3 = this.maximumWeight;
            long l4 = l3 - l2;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 == false) {
                bl2 = true;
            }
            object = "maximumWeight requires weigher";
            Preconditions.checkState(bl2, object);
        } else {
            Object object4 = this.strictParsing;
            if (object4) {
                long l7 = this.maximumWeight;
                long l8 = l7 - l2;
                object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object4) {
                    bl2 = true;
                }
                object = "weigher requires maximumWeight";
                Preconditions.checkState(bl2, object);
            } else {
                long l12 = this.maximumWeight;
                long l14 = l12 - l2;
                object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (!object2) {
                    object = CacheBuilder$LoggerHolder.logger;
                    level = Level.WARNING;
                    String string2 = "ignoring weigher specified without maximumWeight";
                    ((Logger)object).log(level, string2);
                }
            }
        }
    }

    public static CacheBuilder from(CacheBuilderSpec cacheBuilderSpec) {
        return cacheBuilderSpec.toCacheBuilder().lenientParsing();
    }

    public static CacheBuilder from(String string2) {
        return CacheBuilder.from(CacheBuilderSpec.parse(string2));
    }

    public static CacheBuilder newBuilder() {
        CacheBuilder cacheBuilder = new CacheBuilder();
        return cacheBuilder;
    }

    public Cache build() {
        this.checkWeightWithWeigher();
        this.checkNonLoadingCache();
        LocalCache$LocalManualCache localCache$LocalManualCache = new LocalCache$LocalManualCache(this);
        return localCache$LocalManualCache;
    }

    public LoadingCache build(CacheLoader cacheLoader) {
        this.checkWeightWithWeigher();
        LocalCache$LocalLoadingCache localCache$LocalLoadingCache = new LocalCache$LocalLoadingCache(this, cacheLoader);
        return localCache$LocalLoadingCache;
    }

    public CacheBuilder concurrencyLevel(int n3) {
        int n4 = this.concurrencyLevel;
        int n7 = -1;
        boolean bl2 = false;
        n7 = n4 == n7 ? 1 : 0;
        String string2 = "concurrency level was already set to %s";
        Preconditions.checkState(n7 != 0, string2, n4);
        if (n3 > 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        this.concurrencyLevel = n3;
        return this;
    }

    public CacheBuilder expireAfterAccess(long l2, TimeUnit timeUnit) {
        long l3 = this.expireAfterAccessNanos;
        long l4 = -1;
        boolean bl2 = false;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        int n3 = object == false ? 1 : 0;
        String string2 = "expireAfterAccess was already set to %s ns";
        Preconditions.checkState(n3 != 0, string2, l3);
        l3 = 0L;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "duration cannot be negative: %s %s", l2, (Object)timeUnit);
        this.expireAfterAccessNanos = l2 = timeUnit.toNanos(l2);
        return this;
    }

    public CacheBuilder expireAfterWrite(long l2, TimeUnit timeUnit) {
        long l3 = this.expireAfterWriteNanos;
        long l4 = -1;
        boolean bl2 = false;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        int n3 = object == false ? 1 : 0;
        String string2 = "expireAfterWrite was already set to %s ns";
        Preconditions.checkState(n3 != 0, string2, l3);
        l3 = 0L;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "duration cannot be negative: %s %s", l2, (Object)timeUnit);
        this.expireAfterWriteNanos = l2 = timeUnit.toNanos(l2);
        return this;
    }

    public int getConcurrencyLevel() {
        int n3 = this.concurrencyLevel;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 4;
        }
        return n3;
    }

    public long getExpireAfterAccessNanos() {
        long l2 = this.expireAfterAccessNanos;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l2 = 0L;
        }
        return l2;
    }

    public long getExpireAfterWriteNanos() {
        long l2 = this.expireAfterWriteNanos;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l2 = 0L;
        }
        return l2;
    }

    public int getInitialCapacity() {
        int n3 = this.initialCapacity;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 16;
        }
        return n3;
    }

    public Equivalence getKeyEquivalence() {
        Equivalence equivalence = this.keyEquivalence;
        Equivalence equivalence2 = this.getKeyStrength().defaultEquivalence();
        return (Equivalence)MoreObjects.firstNonNull(equivalence, equivalence2);
    }

    public LocalCache$Strength getKeyStrength() {
        LocalCache$Strength localCache$Strength = this.keyStrength;
        LocalCache$Strength localCache$Strength2 = LocalCache$Strength.STRONG;
        return (LocalCache$Strength)((Object)MoreObjects.firstNonNull((Object)localCache$Strength, (Object)localCache$Strength2));
    }

    public long getMaximumWeight() {
        long l2;
        long l3 = this.expireAfterWriteNanos;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false && (object = (l2 = (l3 = this.expireAfterAccessNanos) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            Weigher weigher = this.weigher;
            l3 = weigher == null ? this.maximumSize : this.maximumWeight;
            return l3;
        }
        return l4;
    }

    public long getRefreshNanos() {
        long l2 = this.refreshNanos;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l2 = 0L;
        }
        return l2;
    }

    public RemovalListener getRemovalListener() {
        RemovalListener removalListener = this.removalListener;
        CacheBuilder$NullListener cacheBuilder$NullListener = CacheBuilder$NullListener.INSTANCE;
        return (RemovalListener)MoreObjects.firstNonNull(removalListener, cacheBuilder$NullListener);
    }

    public Supplier getStatsCounterSupplier() {
        return this.statsCounterSupplier;
    }

    public Ticker getTicker(boolean bl2) {
        Ticker ticker = this.ticker;
        if (ticker != null) {
            return ticker;
        }
        Ticker ticker2 = bl2 ? Ticker.systemTicker() : NULL_TICKER;
        return ticker2;
    }

    public Equivalence getValueEquivalence() {
        Equivalence equivalence = this.valueEquivalence;
        Equivalence equivalence2 = this.getValueStrength().defaultEquivalence();
        return (Equivalence)MoreObjects.firstNonNull(equivalence, equivalence2);
    }

    public LocalCache$Strength getValueStrength() {
        LocalCache$Strength localCache$Strength = this.valueStrength;
        LocalCache$Strength localCache$Strength2 = LocalCache$Strength.STRONG;
        return (LocalCache$Strength)((Object)MoreObjects.firstNonNull((Object)localCache$Strength, (Object)localCache$Strength2));
    }

    public Weigher getWeigher() {
        Weigher weigher = this.weigher;
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher = CacheBuilder$OneWeigher.INSTANCE;
        return (Weigher)MoreObjects.firstNonNull(weigher, cacheBuilder$OneWeigher);
    }

    public CacheBuilder initialCapacity(int n3) {
        int n4 = this.initialCapacity;
        int n7 = -1;
        boolean bl2 = false;
        n7 = n4 == n7 ? 1 : 0;
        String string2 = "initial capacity was already set to %s";
        Preconditions.checkState(n7 != 0, string2, n4);
        if (n3 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        this.initialCapacity = n3;
        return this;
    }

    public boolean isRecordingStats() {
        boolean bl2;
        Supplier supplier = this.statsCounterSupplier;
        Supplier supplier2 = CACHE_STATS_COUNTER;
        if (supplier == supplier2) {
            bl2 = true;
        } else {
            bl2 = false;
            supplier = null;
        }
        return bl2;
    }

    public CacheBuilder keyEquivalence(Equivalence equivalence) {
        Equivalence equivalence2 = this.keyEquivalence;
        boolean bl2 = equivalence2 == null;
        Preconditions.checkState(bl2, "key equivalence was already set to %s", (Object)equivalence2);
        this.keyEquivalence = equivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
        return this;
    }

    public CacheBuilder lenientParsing() {
        this.strictParsing = false;
        return this;
    }

    public CacheBuilder maximumSize(long l2) {
        boolean bl2;
        long l3 = this.maximumSize;
        boolean bl3 = false;
        long l4 = -1;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        object = object == false ? (Object)1 : (Object)0;
        String string2 = "maximum size was already set to %s";
        Preconditions.checkState((boolean)object, string2, l3);
        l3 = this.maximumWeight;
        object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        int n3 = object == false ? 1 : 0;
        String string3 = "maximum weight was already set to %s";
        Preconditions.checkState(n3 != 0, string3, l3);
        Weigher weigher = this.weigher;
        if (weigher == null) {
            bl2 = true;
        } else {
            bl2 = false;
            weigher = null;
        }
        String string4 = "maximum size can not be combined with weigher";
        Preconditions.checkState(bl2, string4);
        l3 = 0L;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 >= 0) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "maximum size must not be negative");
        this.maximumSize = l2;
        return this;
    }

    public CacheBuilder maximumWeight(long l2) {
        long l3 = this.maximumWeight;
        boolean bl2 = false;
        long l4 = -1;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        object = object == false ? (Object)1 : (Object)0;
        String string2 = "maximum weight was already set to %s";
        Preconditions.checkState((boolean)object, string2, l3);
        l3 = this.maximumSize;
        object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        int n3 = object == false ? 1 : 0;
        String string3 = "maximum size was already set to %s";
        Preconditions.checkState(n3 != 0, string3, l3);
        l3 = 0L;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "maximum weight must not be negative");
        this.maximumWeight = l2;
        return this;
    }

    public CacheBuilder recordStats() {
        Supplier supplier;
        this.statsCounterSupplier = supplier = CACHE_STATS_COUNTER;
        return this;
    }

    public CacheBuilder refreshAfterWrite(long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull((Object)timeUnit);
        long l3 = this.refreshNanos;
        long l4 = -1;
        boolean bl2 = false;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        int n3 = l7 == false ? 1 : 0;
        String string2 = "refresh was already set to %s ns";
        Preconditions.checkState(n3 != 0, string2, l3);
        l3 = 0L;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 > 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "duration must be positive: %s %s", l2, (Object)timeUnit);
        this.refreshNanos = l2 = timeUnit.toNanos(l2);
        return this;
    }

    public CacheBuilder removalListener(RemovalListener removalListener) {
        boolean bl2;
        RemovalListener removalListener2 = this.removalListener;
        if (removalListener2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            removalListener2 = null;
        }
        Preconditions.checkState(bl2);
        this.removalListener = removalListener = (RemovalListener)Preconditions.checkNotNull(removalListener);
        return this;
    }

    public CacheBuilder setKeyStrength(LocalCache$Strength localCache$Strength) {
        LocalCache$Strength localCache$Strength2 = this.keyStrength;
        boolean bl2 = localCache$Strength2 == null;
        Preconditions.checkState(bl2, "Key strength was already set to %s", (Object)localCache$Strength2);
        this.keyStrength = localCache$Strength = (LocalCache$Strength)((Object)Preconditions.checkNotNull((Object)localCache$Strength));
        return this;
    }

    public CacheBuilder setValueStrength(LocalCache$Strength localCache$Strength) {
        LocalCache$Strength localCache$Strength2 = this.valueStrength;
        boolean bl2 = localCache$Strength2 == null;
        Preconditions.checkState(bl2, "Value strength was already set to %s", (Object)localCache$Strength2);
        this.valueStrength = localCache$Strength = (LocalCache$Strength)((Object)Preconditions.checkNotNull((Object)localCache$Strength));
        return this;
    }

    public CacheBuilder softValues() {
        LocalCache$Strength localCache$Strength = LocalCache$Strength.SOFT;
        return this.setValueStrength(localCache$Strength);
    }

    public CacheBuilder ticker(Ticker ticker) {
        boolean bl2;
        Ticker ticker2 = this.ticker;
        if (ticker2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            ticker2 = null;
        }
        Preconditions.checkState(bl2);
        this.ticker = ticker = (Ticker)Preconditions.checkNotNull(ticker);
        return this;
    }

    public String toString() {
        long l2;
        Object object;
        long l3;
        String string2;
        long l4;
        long l7;
        long l8;
        long l12;
        String string3;
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        int n3 = this.initialCapacity;
        int n4 = -1;
        if (n3 != n4) {
            String string4 = "initialCapacity";
            moreObjects$ToStringHelper.add(string4, n3);
        }
        if ((n3 = this.concurrencyLevel) != n4) {
            string3 = "concurrencyLevel";
            moreObjects$ToStringHelper.add(string3, n3);
        }
        if ((l12 = (l8 = (l7 = this.maximumSize) - (l4 = (long)-1)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
            string2 = "maximumSize";
            moreObjects$ToStringHelper.add(string2, l7);
        }
        if ((l12 = (l3 = (l7 = this.maximumWeight) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            string2 = "maximumWeight";
            moreObjects$ToStringHelper.add(string2, l7);
        }
        l7 = this.expireAfterWriteNanos;
        string2 = "ns";
        Object object2 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
        if (object2 != false) {
            object = new StringBuilder();
            long l14 = this.expireAfterWriteNanos;
            object = jl0_0.b(object, l14, string2);
            string3 = "expireAfterWrite";
            moreObjects$ToStringHelper.add(string3, object);
        }
        if ((object2 = (l2 = (l7 = this.expireAfterAccessNanos) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            object = new StringBuilder();
            long l15 = this.expireAfterAccessNanos;
            object = jl0_0.b(object, l15, string2);
            string3 = "expireAfterAccess";
            moreObjects$ToStringHelper.add(string3, object);
        }
        if ((object = this.keyStrength) != null) {
            object = Ascii.toLowerCase(((Object)object).toString());
            string3 = "keyStrength";
            moreObjects$ToStringHelper.add(string3, object);
        }
        if ((object = this.valueStrength) != null) {
            object = Ascii.toLowerCase(((Object)object).toString());
            string3 = "valueStrength";
            moreObjects$ToStringHelper.add(string3, object);
        }
        if ((object = this.keyEquivalence) != null) {
            object = "keyEquivalence";
            moreObjects$ToStringHelper.addValue(object);
        }
        if ((object = this.valueEquivalence) != null) {
            object = "valueEquivalence";
            moreObjects$ToStringHelper.addValue(object);
        }
        if ((object = this.removalListener) != null) {
            object = "removalListener";
            moreObjects$ToStringHelper.addValue(object);
        }
        return moreObjects$ToStringHelper.toString();
    }

    public CacheBuilder valueEquivalence(Equivalence equivalence) {
        Equivalence equivalence2 = this.valueEquivalence;
        boolean bl2 = equivalence2 == null;
        Preconditions.checkState(bl2, "value equivalence was already set to %s", (Object)equivalence2);
        this.valueEquivalence = equivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
        return this;
    }

    public CacheBuilder weakKeys() {
        LocalCache$Strength localCache$Strength = LocalCache$Strength.WEAK;
        return this.setKeyStrength(localCache$Strength);
    }

    public CacheBuilder weakValues() {
        LocalCache$Strength localCache$Strength = LocalCache$Strength.WEAK;
        return this.setValueStrength(localCache$Strength);
    }

    public CacheBuilder weigher(Weigher weigher) {
        Object object;
        Object object2 = this.weigher;
        boolean bl2 = false;
        if (object2 == null) {
            object = true;
        } else {
            object = false;
            object2 = null;
        }
        Preconditions.checkState(object);
        object = this.strictParsing;
        if (object) {
            long l2 = this.maximumSize;
            long l3 = -1;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!object) {
                bl2 = true;
            }
            object2 = "weigher can not be combined with maximum size (%s provided)";
            Preconditions.checkState(bl2, (String)object2, l2);
        }
        this.weigher = weigher = (Weigher)Preconditions.checkNotNull(weigher);
        return this;
    }
}

