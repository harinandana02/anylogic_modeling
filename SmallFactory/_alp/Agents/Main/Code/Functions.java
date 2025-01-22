double fnUpdateColor()
{/*ALCODESTART::1737378835334*/
double util = ((double)resourceAssembler.busy() / resourceAssembler.capacity);

if(util == 0.0){
	shpAssembler.setFillColor(UtilitiesColor.white);
}
else if(util < 0.33){
	shpAssembler.setFillColor(UtilitiesColor.green);
}
else if(util <0.67){
	shpAssembler.setFillColor( UtilitiesColor.yellow);
	}
else{
	shpAssembler.setFillColor( UtilitiesColor.red);
	
	}



/*ALCODEEND*/}

