package ai.quantumsense.tgmonitor.servicelocator;

import ai.quantumsense.tgmonitor.backend.Interactor;
import ai.quantumsense.tgmonitor.monitor.LoginCodePrompt;
import ai.quantumsense.tgmonitor.monitor.entities.Emails;
import ai.quantumsense.tgmonitor.monitor.entities.Patterns;

public interface ServiceLocator {
    void registerPatternsRepo(Patterns patterns);
    Patterns getPatternsRepo();
    void registerEmailsRepo(Emails emails);
    Emails getEmailsRepo();
    void registerInteractor(Interactor interactor);
    Interactor getInteractor();
    void registerLoginCodePrompt(LoginCodePrompt loginCodePrompt);
    LoginCodePrompt getLoginCodePrompt();
}
