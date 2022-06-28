let carts= document.querySelectorAll('.btn btn-cart');
for(i=0; i< carts.length; i++){
	carts[i].addEventListener('click',()=>{
		cartNumbers();
	})
}

function cartNumbers(){
	let productNumbers = localStorage.getItem('cartNumbers');
	console.log(productId);
	console.log(typeof productNumbers);
	
	productNumbers = parseInt(productNumbers);
	localstorage.setItem('cartNumbers',1);
}
