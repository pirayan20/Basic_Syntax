(() => {
    const c = document.getElementById('test')
    const ctx = c.getContext('2d');
    ctx.moveTo(0,0);
    ctx.lineTo(200,100);
    ctx.stroke();    
}) ();