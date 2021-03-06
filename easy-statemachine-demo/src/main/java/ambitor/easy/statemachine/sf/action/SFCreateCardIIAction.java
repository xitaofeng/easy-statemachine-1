package ambitor.easy.statemachine.sf.action;


import ambitor.easy.statemachine.core.context.StateContext;
import ambitor.easy.statemachine.sf.enumerate.SFGrantEvent;
import ambitor.easy.statemachine.sf.enumerate.SFGrantState;
import ambitor.easy.statemachine.workflow.action.WorkFlowAction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SFCreateCardIIAction implements WorkFlowAction<SFGrantState,SFGrantEvent> {

    public void execute(StateContext<SFGrantState, SFGrantEvent> context) {
        log.info("开二类户");
    }


}
