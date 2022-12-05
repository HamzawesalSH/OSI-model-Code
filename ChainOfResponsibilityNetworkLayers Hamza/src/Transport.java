public class Transport implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            request.addData("+This is Transport layer");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
