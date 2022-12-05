public class Network implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }
    @Override
    public void process(Data request) {

        if (request.getData() != null){
            request.addData("+Network Layer Header");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
