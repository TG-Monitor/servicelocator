package ai.quantumsense.tgmonitor.servicelocator;

public interface ServiceLocator<T> {
    void registerService(T type);
    T getService();
}
