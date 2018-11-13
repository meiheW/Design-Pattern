package Others.visitor;

import Others.visitor.element.ConsumeBill;
import Others.visitor.element.IncomeBill;

public interface AccountBookViewer {
    void view(ConsumeBill bill);
    void view(IncomeBill bill);
}