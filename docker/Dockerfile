from busybox

ARG NOVO=teste
ENV TESTE=$NOVO

CMD sh -c "echo AAA; env; echo $TESTE > novo.txt; cat novo.txt"