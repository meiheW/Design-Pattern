package Others.visitor.element;

import Others.visitor.AccountBookViewer;

public interface Bill {
    void accept(AccountBookViewer viewer);
}
